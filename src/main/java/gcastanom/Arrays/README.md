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

* En Java, los arreglos son de tamaño fijo, una vez definidos, no pueden crecer ni reducirse

A diferencia de Python o TypeScript, donde se puede agregar elementos fácilmente, en Java se debe definir el tamaño desde el inicio.

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