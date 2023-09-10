package aprendizaje.arreglos;

import java.util.Scanner;

public class Ejercicio17 {

    /*
    Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
    de 2 dígitos, etcétera (hasta 5 dígitos).
     */

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int digitos, cont1, cont2, cont3, cont4, cont5;
        cont1 = 0;
        cont2 = 0;
        cont3 = 0;
        cont4 = 0;
        cont5 = 0;


        System.out.println("Ingrese tamaño de vector");
        int n = leer.nextInt();
        int [] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            numeros[i] = (int) (Math.random()* 99999) + 1;
        }

        System.out.println("VECTOR");

        for (int i = 0; i < n; i++) {
            System.out.print("[" + numeros[i] + "]");
        }

        System.out.println(" ");

        for (int i = 0; i < n; i++) {
            digitos = contarDigitos(numeros[i]);

            switch (digitos){

                case 1:
                    cont1++;
                    break;
                case 2:
                    cont2++;
                    break;
                case 3:
                    cont3++;
                    break;
                case 4:
                    cont4++;
                    break;
                case 5:
                    cont5++;
                    break;
            }
        }

        System.out.println("Cantidad de números con 1 dígito: "+cont1);
        System.out.println("Cantidad de números con 2 dígitos: "+cont2);
        System.out.println("Cantidad de números con 3 dígitos: "+cont3);
        System.out.println("Cantidad de números con 4 dígitos: "+cont4);
        System.out.println("Cantidad de números con 5 dígitos: "+cont5);

    }

    public static int contarDigitos(int numero){

        int cont;
        cont = 0;

        do {
            numero=numero/10;
            numero=Math.abs(numero);
            cont++;
        }while(numero>0);

        return cont;

    }

}
