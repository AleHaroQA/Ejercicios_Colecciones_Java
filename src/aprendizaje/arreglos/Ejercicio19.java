package aprendizaje.arreglos;

import java.util.Scanner;

public class Ejercicio19 {

    /*
    Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que
    una matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada
    de signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
    denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
     */

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int t = 3;
        int[][] matrizOriginal = new int[t][t];

        for (int i = 0; i <t; i++) {
            for (int j = 0; j <t; j++) {
                System.out.print("Ingrese un valor para la posición " + i + "," + j + ": ");
                matrizOriginal[i][j] = leer.nextInt();
            }
        }

        System.out.println("MATRIZ ORIGINAL");

        for (int i = 0; i <t; i++) {
            for (int j = 0; j <t; j++) {
                System.out.print("[" + matrizOriginal[i][j] + "]");
            }
            System.out.println(" ");
        }

        System.out.println("MATRIZ TRASPUESTA");

        for (int i = 0; i <t; i++) {
            for (int j = 0; j <t; j++) {
                System.out.print("[" + matrizOriginal[j][i] + "]");
            }
            System.out.println(" ");
        }

        validarAntiSimetrica(matrizOriginal,t);

    }

    public static void validarAntiSimetrica(int[][] matriz1, int t){

        int cont = 0;

        for (int i = 0; i <t; i++) {
            for (int j = 0; j <t; j++) {
                if (matriz1[i][j] == -(matriz1[j][i])) {
                    cont++;
                }
            }
        }

        if (cont == t*t) {
            System.out.println("La matriz es anti simétrica");
        }else{
            System.out.println("La matriz NO es anti simétrica");
        }

    }
}
