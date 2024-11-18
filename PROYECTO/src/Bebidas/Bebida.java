package Bebidas;

import java.util.Scanner;

public class Bebida {
    public void elegirTipoBebida() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el tipo de bebida:");
        System.out.println("1. Bebida Caliente");
        System.out.println("2. Bebida Fría");

        int opcion = scanner.nextInt();

        if (opcion == 1) {
            Tipo_de_Bebida tipo = new Tipo_de_Bebida("Caliente");
            tipo.mostrarOpciones();
        } else if (opcion == 2) {
            Tipo_de_Bebida tipo = new Tipo_de_Bebida("Fría");
            tipo.mostrarOpciones();
        } else {
            System.out.println("Opción no válida.");
        }
    }
}
