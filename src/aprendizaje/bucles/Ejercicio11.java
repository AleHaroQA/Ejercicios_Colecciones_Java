package aprendizaje.bucles;

import java.util.Scanner;

public class Ejercicio11 {

    /*Realizar un programa que pida dos números enteros positivos por teclado y muestre por
    pantalla el siguiente menú:

    MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
   Elija opción:

    El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
    pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
    opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del
    programa directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está
    seguro que desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale
    del programa, caso contrario se vuelve a mostrar el menú.*/

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int opc;
        String resp;
        boolean salir;
        float suma, resta, mult, div, n1, n2;
        salir = false;

        System.out.println("Ingrese 2 números para realizar una operación:");
        n1 = leer.nextInt();
        n2 = leer.nextInt();

        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.println("Elija opción:");

            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    suma = n1 + n2;
                    System.out.println("El resultado de la suma es: " + suma);
                    continue;
                case 2:
                    resta = n1 - n2;
                    System.out.println("El resultado de la resta es: " + resta);
                    continue;
                case 3:
                    mult = n1 * n2;
                    System.out.println("El resultado de la multiplicación es: " + mult);
                    continue;
                case 4:
                    div = n1 / n2;
                    System.out.println("El resultado de la división es: " + div);
                    continue;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    resp = leer.next();
                    if (resp.equalsIgnoreCase("s")) {
                        salir = true;
                        break;
                    } else {
                        continue;
                    }
                default:
                    System.out.println("Debe escoger una opción que esté en el menú");
                    continue;
            }
        } while (salir != true);

    }
}
