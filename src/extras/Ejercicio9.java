package extras;

import java.util.Scanner;

public class Ejercicio9 {

    /*
    Simular la división usando solamente restas. Dados dos números enteros mayores que
    uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo restas.
    Método: Restar el dividendo del divisor hasta obtener un resultado menor que el divisor,
    este resultado es el residuo, y el número de restas realizadas es el cociente.
    Por ejemplo: 50 / 13:
    50 – 13 = 37 una resta realizada
    37 – 13 = 24 dos restas realizadas

    24 – 13 = 11 tres restas realizadas dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
     */

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        double dividendo, divisor, cociente, resto;

        System.out.println("Ingreso dividendo:");
        dividendo = leer.nextDouble();
        System.out.println("Ingreso divisor:");
        divisor = leer.nextDouble();

        resto = dividendo-divisor;
        cociente = 1;

        do {
            resto = resto - divisor;
            cociente++;
            if (resto == divisor) {
                resto = 0;
            }
        } while (resto > divisor);

        System.out.println("Cociente: " + cociente);
        System.out.println("Resto: " + resto);
    }
}
