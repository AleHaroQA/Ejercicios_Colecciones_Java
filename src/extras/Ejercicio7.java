package extras;

import java.util.Scanner;

public class Ejercicio7 {

    /*
    Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
    promedio de n números (n>0). El valor de n se solicitará al principio del programa y los
    números serán introducidos por el usuario. Realice dos versiones del programa, una
    usando el bucle “while” y otra con el bucle “do - while”.
     */

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        int cantidad, cont, num, numMax, numMin;
        float promedio, suma;
        suma = 0;
        cont = 1;
        numMax = 0;
        numMin = 0;

        do {
            System.out.println("Ingrese cantidad de números:");
            cantidad = reader.nextInt();
        } while (cantidad < 1);

        do {
            System.out.print("Ingrese número " + cont + "/" + cantidad + ": ");
            num = reader.nextInt();

            if (num != 0) {
                cont++;
                suma += num;

                if (num > numMax) {
                    numMax = num;
                } else {
                    numMin = num;
                }
            }
        } while (cont <= cantidad);

        promedio = suma / cantidad;
        System.out.println("Número mayor: " + numMax);
        System.out.println("Número menor: " + numMin);
        System.out.println("Promedio: " + promedio);
    }
}
