package gcastanom.Arrays;

import java.util.Random;

public class Arreglos {

        public static void main(String[] args) {

            int[] valores = new int[10];
            Random random = new Random();

            // Inicializar con valores aleatorios
            for (int i = 0; i < valores.length; i++) {
                valores[i] = random.nextInt(100);
            }

            System.out.println("Arreglo inicial:");
            for (int v : valores) {
                System.out.print(v + " ");
            }
            System.out.println();
            System.out.println();

            //Recorrido for
            for (int i = 0; i < valores.length; i++) {
                System.out.println("Indice " + i + ", que corresponde a la posición "+ (i+1) +": " + valores[i]);
            }

            System.out.println();

            //Recorrido For each
            for (int valor : valores) {
                System.out.println(valor);
            }

            System.out.println();

            //Cambiar todos los valores impares por cero
            for (int i = 0; i < valores.length; i++) {
                if (valores[i] % 2 != 0) { // ahora sí: impares
                    valores[i] = 0;
                }
                System.out.println("Indice " + i + ": " + valores[i]);
            }
            System.out.println();
            System.out.println();

            //Multiplicar todos los valores por su indice
            for (int i = 0; i < valores.length; i++) {
                valores[i] = valores[i] * i;
                System.out.println("Indice " + i + ": " + valores[i]);
            }

            System.out.println();
            System.out.println();
            // Busqueda lineal
            int objetivo = valores[3];
            int resultado = busquedaLineal(valores, objetivo);

            if (resultado != -1) {
                System.out.println("Valor encontrado en la posición: " + resultado);
            } else {
                System.out.println("Valor no encontrado");
            }
        }
    // Metodo busqueda lineal
    public static int busquedaLineal(int[] arreglo, int valorBuscado) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valorBuscado) {
                return i;
            }
        }
        return -1;
    }
}






