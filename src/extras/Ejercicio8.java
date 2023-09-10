package extras;

import java.util.Scanner;

public class Ejercicio8 {

    /*
    Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
    detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares
    y la cantidad de números impares. Al igual que en el ejercicio anterior los números
    negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
     */

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int num,cantidad, pares, impares;
        cantidad = 0;
        pares = 0;
        impares = 0;

        do {
            System.out.println("Ingrese número:");
            num = leer.nextInt();
            if (num>0) {
                cantidad++;
            }
            if (num%2 == 0 && num%5 != 0) {
                pares++;
            }else if(num%2 != 0 && num%5 != 0){
                impares++;
            }
        } while (num%5 != 0);

        cantidad--;


        System.out.println("Cantidad de números leídos: " + cantidad);
        System.out.println("Cantidad de números pares: " + pares);
        System.out.println("Cantidad de números impares: " + impares);
    }
}
