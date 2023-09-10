package extras;

public class Ejercicio12 {

    /*
    Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-
    0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
    Ejemplo:
    0-0-0
    0-0-1
    0-0-2
    0-0-E
    0-0-4
    0-1-2
    0-1-E
    Nota: investigar función equals() y como convertir números a String.
     */

    public static void main(String[] args) {

        String first, second, third;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                for (int k = 0; k < 10; k++) {
                    first = String.valueOf(i);
                    second = String.valueOf(j);
                    third = String.valueOf(k);

                    if (first.equals("3")) {
                        first = "E";
                    }
                    if (second.equals("3")) {
                        second = "E";
                    }
                    if (third.equals("3")) {
                        third = "E";
                    }
                    System.out.println(first + "-" + second + "-" + third);
                }
            }
        }

    }
}
