package aprendizaje.arreglos;

import java.util.Scanner;

public class Ejercicio21 {

    /*
    Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de
    3x3, se solicita escribir un programa en el cual se compruebe si la matriz P está contenida
    dentro de la matriz M. Para ello se debe verificar si entre todas las submatrices de 3x3
    que se pueden formar en la matriz M, desplazándose por filas o columnas, existe al
    menos una que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la
    columna de la matriz M en la cual empieza el primer elemento de la submatriz P.
     */

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int m = 10;
        int p = 3;
        int[][] matrizM = new int[m][m];
        int[][] matrizP = new int[p][p];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                matrizM[i][j] = (int) (Math.random() * 9) + 1;
            }
        }

        System.out.println("MATRIZ");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("[" + matrizM[i][j] + "]");
            }
            System.out.println("");
        }

        for (int i = 0; i < p; i++) {
            for (int j = 0; j < p; j++) {
                System.out.print("Ingrese valores de matriz p | Posición " + i + "," + j + ": ");
                matrizP[i][j] = leer.nextInt();
            }
        }

        buscarMatrizP(matrizM, matrizP);
    }

    public static void buscarMatrizP(int[][] matrizM, int[][] matrizP) {

        boolean exist = false;
        int limitP = 3;
        int[][] matrizAux = new int[limitP][limitP];
        int iAux = 0;
        int jAux = 0;
        int contMatricesTotal = 1;

        for (int i = 0; i < limitP; i++) {
            for (int j = 0; j < limitP; j++) {
                matrizAux[i][j] = matrizM[i][j];
            }
        }

        do {
            int cont = 0;
            for (int i = 0; i < limitP; i++) {
                for (int j = 0; j < limitP; j++) {
                    if (matrizP[i][j] == matrizAux[i][j]) {
                        cont++;
                    }
                }
            }

            if (cont == 9) {
                exist = true;
            } else {
                jAux++;
                if (jAux == 8) {
                    jAux = 0;
                    if (iAux < 7) {
                        iAux++;
                    }
                }
                for (int i = 0; i < limitP; i++) {
                    for (int j = 0; j < limitP; j++) {
                        matrizAux[i][j] = matrizM[i + iAux][j + jAux];
                    }
                }
                contMatricesTotal++;
            }
        } while (matrizAux.length == 3 && exist != true && contMatricesTotal < 65);

        if (exist == true) {
            System.out.println("La matriz P ingresada está en las posiciones: ");

            for (int i = 0; i < limitP; i++) {
                for (int j = 0; j < limitP; j++) {
                    System.out.print("[" + (i + iAux) + "," + (j + jAux) + "] ");
                }
                System.out.println("");
            }
        } else {
            System.out.println("La matriz P no se encuentra en la matriz M.");
        }
    }
}
