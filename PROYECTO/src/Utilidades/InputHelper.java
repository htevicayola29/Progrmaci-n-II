package Utilidades;

import java.util.Scanner;

public class InputHelper {
    private static final Scanner scanner = new Scanner(System.in);

    // Método para leer texto
    public static String leerTexto(String mensaje) {
        System.out.println(mensaje);
        return scanner.nextLine();
    }

    // Método para leer enteros con validación
    public static int leerEntero(String mensaje, int min, int max) {
        int numero = -1;
        boolean valido = false;

        while (!valido) {
            try {
                System.out.println(mensaje);
                numero = Integer.parseInt(scanner.nextLine());

                if (numero >= min && numero <= max) {
                    valido = true;
                } else {
                    System.out.println("Por favor, ingrese un número entre " + min + " y " + max + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número.");
            }
        }
        return numero;
    }
}
