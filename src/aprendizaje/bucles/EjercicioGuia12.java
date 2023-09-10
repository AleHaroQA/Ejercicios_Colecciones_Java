package aprendizaje.bucles;

import java.util.Scanner;

public class EjercicioGuia12 {

    /*Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
    que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
    segundo, sino informe que no lo son.*/

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int n1, n2;

        System.out.println("Ingrese primer número");
        n1= leer.nextInt();
        System.out.println("Ingrese segundo número");
        n2= leer.nextInt();

        esMultiplo(n1,n2);
    }

    public static void esMultiplo(int n1, int n2){

        if (n1%n2 == 0){
            System.out.println("El primer número es múltiplo del segundo");
        }else{
            System.out.println("El primer número NO es múltiplo del segundo");
        }

    }

}
