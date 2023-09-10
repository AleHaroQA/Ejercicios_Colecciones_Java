package aprendizaje.arreglos;

public class Ejercicio18 {

    /*
    Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
    traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se
    obtiene cambiando sus filas por columnas (o viceversa).
     */

    public static void main(String[] args) {

    int t = 4;
    int[][] matriz = new  int[t][t];

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                matriz[i][j] = (int) (Math.random()*9)+1;
            }
        }

        System.out.println("MATRIZ ORIGINAL");

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                System.out.print("[" + matriz[i][j] + "]");
            }
            System.out.println(" ");
        }

        System.out.println("MATRIZ TRASPUESTA");

        for (int i = 0; i < t; i++) {
            for (int j = 0; j < t; j++) {
                System.out.print("[" + matriz[j][i] + "]");
            }
            System.out.println(" ");
        }

    }
}
