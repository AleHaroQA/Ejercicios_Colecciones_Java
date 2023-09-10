package aprendizaje.arreglos;

public class ejemplo {

    public static void main(String[] args) {

        int[][] matrizGrande = new int[10][10];
        int[][] matrizChica = new int[3][3];

        llenarMatriz(matrizGrande);
        llenarMatriz2(matrizChica);
        validar(matrizGrande, matrizChica);
    }


    public static void llenarMatriz(int[][] matrizGrande) {
        //llenamos la matriz grande
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matrizGrande[i][j] = (int) (Math.random() * 9) + 1; /*cambié esto para que la matriz se vea ordenada
                                                                          cuando se agrega un 10, queda disparejo */
            }
        }

        matrizGrande[4][4] = 6;
        matrizGrande[4][5] = 5;
        matrizGrande[4][6] = 8;
        matrizGrande[5][4] = 9;
        matrizGrande[5][5] = 7;
        matrizGrande[5][6] = 3;
        matrizGrande[6][4] = 2;
        matrizGrande[6][5] = 0;
        matrizGrande[6][6] = 1;


        System.out.println("Mostramos la matriz grande:");
        System.out.println(" ");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("[" + matrizGrande[i][j] + "]");
            }
            System.out.println(" ");
        }
    }

    public static void llenarMatriz2(int[][] matrizChica) {
        //llenamos la matriz chica

        matrizChica[0][0] = 6;
        matrizChica[0][1] = 5;
        matrizChica[0][2] = 8;
        matrizChica[1][0] = 9;
        matrizChica[1][1] = 7;
        matrizChica[1][2] = 3;
        matrizChica[2][0] = 2;
        matrizChica[2][1] = 0;
        matrizChica[2][2] = 1;

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("Mostramos la matriz chica:");
        System.out.println(" ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("[" + matrizChica[i][j] + "]");
            }
            System.out.println(" ");
        }

    }

    public static void validar(int[][] matrizGrande, int[][] matrizChica) {

        boolean validacion = false;
        int b = 3; // para formar cada vez matrices 3x3
        int kAcumulado = 0; // para ir corriendo columnas
        int lAcumulado = 0; // para ir corriendo filas
        int contGral = 0; // para contabilizar la cantidad de matrices totales que se pueden formar(64)
        int cont = 0; //para validar todos los valores de la matriz

            /*
            Evaluamos si la matriz 3x3 está dentro de la primera matriz 3x3 formada dentro de la 10x10
             */
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < b; j++) {
                if (matrizChica[i][j] == matrizGrande[i][j]) {
                    cont++;
                }
            }
        }

        do {
            if (cont == 9) { //si tenemos 9 coincidencias
                validacion = true;

            } else { // sino
                cont = 0; //reiniciamos contador de coincidencias
                lAcumulado++; // corremos una posición de columna para seguir verificando
                if (lAcumulado == 8) { //si llegamos a la columna 8, no se podrá generar una matriz 3x3
                    lAcumulado = 0; //por lo tanto reiniciamos en 0
                    if (kAcumulado < 7) {//iremos incrementando las filas, hasta donde se forme la ultima matriz 3x3
                        kAcumulado++;
                    }
                }
                        /*
                        comparamos la matriz chica con las posiciones acumuladas y sumadas de la matriz grande
                         */
                for (int k = 0; k < b; k++) {
                    for (int l = 0; l < b; l++) {
                        if (matrizChica[k][l] == matrizGrande[k + kAcumulado][l + lAcumulado]) {
                            cont++;
                        }
                    }
                }
                contGral++; // contador de matrices totales a generar
            }
        } while (validacion != true && contGral < 65); // se repetirá mientras no se encuentren coincidencias y hasta
        // que se formen 64 matrices

        if (validacion == true) { //si se encuentra la matriz, se imprimen las posiciones
            System.out.println("La matriz chica SI se encontro dentro de la matriz grande.");
            System.out.println("Está en las posiciones:");
            for (int i = 0; i < b; i++) {
                for (int j = 0; j < b; j++) {
                    System.out.print("[" + (i + kAcumulado) + "," + (j + lAcumulado) + "] ");
                }
            }
            System.out.println("Fin del programa");

        } else {
            System.out.println("NO se encontro la matriz chica dentro de la matriz grande.");
            System.out.println("Fin del programa.");
        }
    }
}

