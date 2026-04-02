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
## ACTIVIDADES
1. Declaración e inicialización (1 al 9)
```java
int[][] matriz = new int[3][3];

int valor = 1;
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        matriz[i][j] = valor;
        valor++;
    }
}System.out.println("Matriz después de inicializar:");
imprimirMatriz(matriz);
```
2. Recorrido
* Imprimir en forma de Tabla
```java
System.out.println("Matriz:");
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        System.out.print(matriz[i][j] + "\t");
    }
    System.out.println();
}
```
Se usa \t para que quede alineado como tabla.

* Recorrer por columnas
```java
System.out.println("\nRecorrido por columnas:");
for (int j = 0; j < 3; j++) {
    for (int i = 0; i < 3; i++) {
        System.out.print(matriz[i][j] + " ");
    }
    System.out.println();
}
```
Aquí cambias el orden: primero columnas (j), luego filas (i).
4. Operaciones
* Sumar todos los elementos
```java
int suma = 0;

for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        suma += matriz[i][j];
    }
}

System.out.println("\nSuma total: " + suma);
```
Resultado esperado: 45

Tambien podemos hacerlo de esta forma:
```java
    public static int sumarMatriz(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }
```
y llamamos la funcion:
```java
int suma = sumarMatriz(matriz);
System.out.println("\nSuma total: " + suma);
```
* Intercambiar primera fila con la ultima
```java
int[] temp = matriz[0];
matriz[0] = matriz[2];
matriz[2] = temp;
```
Lo anterior intercambia directamente las filas completas y esto las muestra despues del cambio.
```java
System.out.println("\nMatriz después de intercambiar filas:");
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        System.out.print(matriz[i][j] + "\t");
    }
    System.out.println();
}
```