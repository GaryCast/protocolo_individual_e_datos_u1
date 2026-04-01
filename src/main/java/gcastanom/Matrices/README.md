# MATRICES EN JAVA
## Fundamentos
### Concepto de matriz

En Java, una matriz es un arreglo bidimensional, es decir, un arreglo que contiene otros arreglos.
Se usa cuando queremos organizar datos en forma de tabla (filas y columnas), como por ejemplo ventas por días.

### Representación en memoria (fila-columna)

Una matriz se ve así:
```java
int[][] matriz = {
{1, 2, 3},
{4, 5, 6},
{7, 8, 9}
};
```
Para acceder a un elemento:
```java
matriz[fila][columna]
```
Ejemplo:

* matriz[0][1] → 2
* matriz[2][0] → 7

### Declaración e inicialización

En Java:
```java
int[][] matriz = new int[3][3];
```
Esto crea una matriz de 3 filas y 3 columnas.

### Recorridos por filas y columnas
* Por filas: primero recorres filas, luego columnas
* Por columnas: primero columnas, luego filas

### Matrices irregulares

Java también permite matrices donde cada fila tiene distinto tamaño:
```java
int[][] irregular = {
{1, 2},
{3, 4, 5},
{6}
};
```