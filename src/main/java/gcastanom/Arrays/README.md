# ARREGLOS (ARRAYS) EN JAVA
## FUNDAMENTOS
### Concepto de arreglo

Un arreglo en Java es una estructura que permite almacenar varios valores del mismo tipo en una sola variable, organizados por posiciones (índices).
Por ejemplo, en lugar de guardar cada valor de ventas en variables separadas, se puede usar un arreglo para agruparlos.

### Tipos de datos que puede almacenar

En Java, los arreglos son homogéneos, es decir, solo pueden almacenar un tipo de dato:

* int[] → enteros
* double[] → decimales
* String[] → cadenas

Ejemplo:
```java
int[] numeros = {1, 2, 3};
```
### Diferencia entre tamaño fijo y dinámico

En Java, los arreglos son de tamaño fijo, una vez definidos, no pueden crecer ni reducirse. A diferencia de Python o TypeScript, donde se puede agregar elementos fácilmente, en Java se debe definir el tamaño desde el inicio.

### Indexación y posiciones

Los índices empiezan en 0:
```java
int[] ejemplo = {10, 20, 30};
```
* ejemplo[0] → 10
* ejemplo[1] → 20

### Operaciones básicas

Las operaciones principales son:

* Declarar
* Inicializar
* Recorrer
* Modificar


## ACTIVIDADES
1. Declaración y creación de un arreglo

Vamos a crear un arreglo de 10 enteros con valores aleatorios.
```java
import java.util.Random;

public class ArreglosJava {

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
    }
}
```
Explicación:
Se crea un arreglo de tamaño fijo (10 posiciones) y se llena con números aleatorios entre 0 y 99.

2. Recorrido e impresión 
* For 
```java
for (int i = 0; i < valores.length; i++) {
        System.out.println("Indice " + i + ", que corresponde a la posición "+ (i+1) +": " + valores[i]);
}
```
Este es el más importante porque permite trabajar con el índice directamente.

* For-each
```java
for (int valor : valores) {
    System.out.println(valor);
}
```
Es más simple, pero no permite acceder al índice.

3. Modificación
* Cambiar todos los valores impares por cero
```java
   for (int i = 0; i < valores.length; i++) {
        if (valores[i] % 2 != 0) { 
        valores[i] = 0;
        }
    System.out.println("Indice " + i + ": " + valores[i]);
    }
```
* Multiplicar todos los valores por su índice
```java
for (int i = 0; i < valores.length; i++) {
valores[i] = valores[i] * i;
}
```
4. Búsqueda
* Búsqueda lineal
```java
public static int busquedaLineal(int[] arreglo, int valorBuscado) {
    for (int i = 0; i < arreglo.length; i++) {
        if (arreglo[i] == valorBuscado) {
            return i;
        }
    }
    return -1;
}
```
Uso (llamando a la funcion)
```java
int objetivo = valores[3]; 
int resultado = busquedaLineal(valores, objetivo);

if (resultado != -1) {
    System.out.println("Valor encontrado en la posición: " + resultado);
} else {
    System.out.println("Valor no encontrado");
}
```
Se recorre el arreglo elemento por elemento hasta encontrar el valor.

5. Comparativa (Java vs otros lenguajes)

Java es un lenguaje de tipado fuerte y estático, lo que significa que se debe definir el tipo de dato y el tamaño del arreglo desde el inicio. A diferencia de Python y TypeScript, los arreglos en Java son de tamaño fijo, lo que los hace menos flexibles pero más eficientes y seguros en memoria. Además, su sintaxis es más estructurada, lo que favorece el desarrollo de aplicaciones grandes y organizadas.