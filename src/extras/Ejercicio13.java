package extras;

import java.util.Scanner;

public class Ejercicio13 {

    /*
    Crear un programa que dibuje una escalera de números, donde cada línea de números
    comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
    usuario al comenzar. Ejemplo: si se ingresa el número 3:
    1
    12
    123
     */

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int num,numJ;
        numJ=1;

        System.out.println("Ingrese número para mostrar escalera:");
        num = reader.nextInt();

        for (int i = 1; i < num+1; i++) {
            System.out.println("");
            for (int j = 1; j <=numJ; j++) {
                System.out.print(j);
            }
            numJ++;
        }
        System.out.println("");
    }
}
