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
