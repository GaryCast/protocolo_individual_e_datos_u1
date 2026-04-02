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