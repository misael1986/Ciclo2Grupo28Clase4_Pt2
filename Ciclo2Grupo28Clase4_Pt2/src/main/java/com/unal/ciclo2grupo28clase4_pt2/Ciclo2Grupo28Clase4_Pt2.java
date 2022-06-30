package com.unal.ciclo2grupo28clase4_pt2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ciclo2Grupo28Clase4_Pt2 {

    public static void main(String[] args) {
        Scanner te = new Scanner(System.in);

        /*
        System.out.println("Digite un solo caracter:");
        char letra = te.nextLine().charAt(0);
        System.out.println("es minuscula?: " + esMinuscula(letra));
        System.out.println("es Par?: " + esASCIIPar(letra));
         */
 /*System.out.println("Digite un numero real:");
        double num = te.nextDouble();
        System.out.println(determinarNumero(num));
         */
        //System.out.println(determinarPunto(0, 2.8));
       
        /*
        System.out.println(ejesPlano(1.5, 6));
        System.out.println(ejesPlano(-3, 5.5));
        System.out.println(ejesPlano(0, 10.0001));
        System.out.println(ejesPlano(-2, -3));
        System.out.println(ejesPlano(8, -5));
        */
        
        System.out.println(desigualdadTriangular(0.5 ,4.4 ,5));

    }

    //--------------
    public static boolean esMinuscula(char c) {
        boolean siEs = false;
        if ((c >= 'a' && c <= 'z') || c == 'ñ') {//if (c >= 97 && c <= 122 || c==164) {
            siEs = true;
        }
        return siEs;
    }

    //----------------
    public static boolean esASCIIPar(char c) {
        if (c % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //------------------
    public static String determinarNumero(double x) {
        String resultado;
        if (x > 0) {
            resultado = "El numero " + x + " es positivo";
        } else if (x < 0) {
            resultado = "El numero " + x + " es negativo";
        } else {
            resultado = "El numero " + x + " es el neutro para la suma";
        }

        return resultado;
    }

    public static boolean determinarPunto(double h, double k) {
        boolean siEsta = false;
        double x, y, r;
        x = 0;
        y = 0;
        r = 3;
        double p1 = Math.pow(x - h, 2);
        double p2 = Math.pow(y - k, 2);
        if ((p1 + p2) <= (r * r)) {
            siEsta = true;
        }

        return siEsta;
    }

    //----EJES DEL PLANO CARTESIANO
    public static String ejesPlano(double x, double y) {
        String respuesta = "";
        if (x == 0 || y == 0) {
            respuesta = "Ejes";
        } else if (x > 0 && y > 0) {
            respuesta = "I";
        } else if (x < 0 && y > 0) {
            respuesta = "II";
        } else if (x < 0 && y < 0) {
            respuesta = "III";
        } else {
            respuesta = "IV";
        }

        return respuesta;
    }

    //---Desigualdad triangular
    public static boolean desigualdadTriangular(double a, double b, double c) {
        boolean siCumplen = false;
        boolean banderaA = false;
        boolean banderaB = false;
        boolean banderaC = false;

        if (a < (b + c)) {
            banderaA = true;
        }
        if (b < (a + c)) {
            banderaB = true;
        }
        if (c < (a + b)) {
            banderaC = true;
        }

        if (banderaA == true && banderaB == true && banderaC == true) {
            siCumplen = true;
        }
        return siCumplen;
    }

}
