package gcastanom.Matrices;

public class Matrices {

    public static void main(String[] args) {

        // Declaración e inicialización
        int[][] matriz = new int[3][3];

        int valor = 1;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = valor;
                valor++;
            }
        }System.out.println("Matriz después de inicializar:");
        imprimirMatriz(matriz);

        System.out.println("");

        // Imprimir en forma de tabla
        System.out.println("Matriz inicial:");
        imprimirMatriz(matriz);

        // Recorrido por columnas
        System.out.println("\nRecorrido por columnas:");
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        // Sumar todos los elementos
        int suma = sumarMatriz(matriz);
        System.out.println("\nSuma total: " + suma);

        // Intercambiar primera fila con la última
        intercambiarFilas(matriz);

        System.out.println("\nMatriz después de intercambiar filas:");
        imprimirMatriz(matriz);
    }

    // Metodo para imprimir matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

    // Metodo para sumar elementos
    public static int sumarMatriz(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }

    //Metodo para intercambiar filas
    public static void intercambiarFilas(int[][] matriz) {
        int[] temp = matriz[0];
        matriz[0] = matriz[matriz.length - 1];
        matriz[matriz.length - 1] = temp;
    }
}