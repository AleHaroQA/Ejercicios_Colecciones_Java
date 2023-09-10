package extras;

public class Ejercicio2 {

    /*
    Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
    una. A continuación, realizar las instrucciones necesarias para que: B tome el valor de C,
    C tome el valor de A, A tome el valor de D y D tome el valor de B. Mostrar los valores
    iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
     */

    public static void main(String[] args) {

        int A, B, C, D, aux;
        A = 6; // 2 D
        B = 3; // 8 C
        C = 8; // 6 A
        D = 2; // 3 B
        aux = 0;

        System.out.println("Valores iniciales de las 4 variables");
        System.out.println("A: " + A + " B: " + B + " C: " + C + " D: " + D);

        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;


        System.out.println("Valores finales de las 4 variables");
        System.out.println("A: " + A + " B: " + B + " C: " + C + " D: " + D);

    }
}
