# Ejercicio 8 (Generador de Contraseñas)
Desarrollar un programa Java, aplicando Arreglos y/o Matrices.
* Usar arreglos de caracteres (mayúsculas, minúsculas, dígitos, símbolos).
* Generar contraseñas aleatorias con longitud variable.
* Validar que tengan al menos un carácter de cada tipo.

## Desarrollo
* Logica
```java
package gcastanom.Ejercicio8_Generador_de_contraseñas;

import java.util.Random;

public class GeneradorContrasenas {

    // Generar contraseña
    public static String generarPassword(int longitud) {

        char[] mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        char[] minusculas = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] numeros = "0123456789".toCharArray();
        char[] simbolos = "!@#$%^&*()".toCharArray();

        // Unir todos los caracteres
        char[] todos = (new String(mayusculas) +
                new String(minusculas) +
                new String(numeros) +
                new String(simbolos)).toCharArray();

        Random random = new Random();
        String password = "";

        for (int i = 0; i < longitud; i++) {
            int index = random.nextInt(todos.length);
            password += todos[index];
        }

        return password;
    }

    // Validar contraseña
    public static boolean validarPassword(String password) {

        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneNumero = false;
        boolean tieneSimbolo = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isUpperCase(c)) tieneMayuscula = true;
            else if (Character.isLowerCase(c)) tieneMinuscula = true;
            else if (Character.isDigit(c)) tieneNumero = true;
            else tieneSimbolo = true;
        }

        return tieneMayuscula && tieneMinuscula && tieneNumero && tieneSimbolo;
    }
}
```
* Ejecución
```java
package gcastanom.Ejercicio8_Generador_de_contraseñas;

public class Main {

    public static void main(String[] args) {

        int longitud = 10;

        String password;

        //  Generar hasta que sea válida
        do {
            password = GeneradorContrasenas.generarPassword(longitud);
        } while (!GeneradorContrasenas.validarPassword(password));

        System.out.println("Contraseña generada: " + password);
        System.out.println("La contraseña es válida ");
    }
}
```
El programa está dividido en dos clases para mejorar la organización y reutilización del código. La clase GeneradorContrasenas contiene la lógica para generar y validar contraseñas, mientras que la clase Main se encarga de ejecutar el programa. Esta separación permite aplicar buenas prácticas de programación como la modularidad y el principio de responsabilidad única, facilitando el mantenimiento y la escalabilidad del sistema.
