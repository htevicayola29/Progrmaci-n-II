package Bebidas;

import java.util.Scanner;

public class Tipo_de_Bebida {
    private String categoria; // Caliente o Fría
    private String tipo; // Café, Té, Chocolate
    private String calidad; // Popular o Especial

    // Constructor
    public Tipo_de_Bebida(String categoria) {
        this.categoria = categoria;
    }

    // Getters y Setters
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCalidad() {
        return calidad;
    }

    public void setCalidad(String calidad) {
        this.calidad = calidad;
    }

    // Método principal para gestionar las opciones
    public void mostrarOpciones() {
        Scanner scanner = new Scanner(System.in);

        // Selección del tipo de bebida
        System.out.println("Seleccione el tipo de bebida (" + categoria + "):");
        System.out.println("1. Café");
        System.out.println("2. Té");
        System.out.println("3. Chocolate");

        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                tipo = "Café";
                break;
            case 2:
                tipo = "Té";
                break;
            case 3:
                tipo = "Chocolate";
                break;
            default:
                System.out.println("Opción no válida.");
                return;
        }

        // Selección de calidad
        System.out.println("Seleccione la calidad:");
        System.out.println("1. Popular");
        System.out.println("2. Especial");

        int calidadOpcion = scanner.nextInt();

        if (calidadOpcion == 1) {
            calidad = "Popular";
        } else if (calidadOpcion == 2) {
            calidad = "Especial";
        } else {
            System.out.println("Opción no válida.");
            return;
        }

        // Mostrar menú detallado según categoría, tipo y calidad
        mostrarMenuEspecifico();
    }

    // Método para mostrar el menú detallado basado en las elecciones del usuario
    private void mostrarMenuEspecifico() {
        System.out.println("Usted ha seleccionado: " + tipo + " (" + calidad + ") - " + categoria);
        if (categoria.equalsIgnoreCase("Caliente")) {
            mostrarMenuCaliente();
        } else if (categoria.equalsIgnoreCase("Fría")) {
            mostrarMenuFria();
        } else {
            System.out.println("Categoría no reconocida.");
        }
    }

    // Menú de bebidas calientes
    private void mostrarMenuCaliente() {
        System.out.println("Opciones de " + tipo + " caliente (" + calidad + "):");

        if (tipo.equalsIgnoreCase("Café")) {
            if (calidad.equalsIgnoreCase("Popular")) {
                System.out.println("1. Café Americano - $1.50");
                System.out.println("2. Café de olla - $1.80");
            } else {
                System.out.println("1. Espresso - $2.50");
                System.out.println("2. Cappuccino - $3.00");
            }
        } else if (tipo.equalsIgnoreCase("Té")) {
            if (calidad.equalsIgnoreCase("Popular")) {
                System.out.println("1. Té Negro - $1.20");
                System.out.println("2. Té Verde - $1.20");
            } else {
                System.out.println("1. Té Chai - $2.50");
                System.out.println("2. Té Matcha - $3.00");
            }
        } else if (tipo.equalsIgnoreCase("Chocolate")) {
            if (calidad.equalsIgnoreCase("Popular")) {
                System.out.println("1. Chocolate con leche - $2.00");
                System.out.println("2. Chocolate clásico - $2.50");
            } else {
                System.out.println("1. Chocolate amargo - $3.00");
                System.out.println("2. Chocolate especiado - $3.50");
            }
        } else {
            System.out.println("Tipo de bebida no reconocida.");
        }
    }

    // Menú de bebidas frías con precios
    private void mostrarMenuFria() {
        System.out.println("Opciones de " + tipo + " fría (" + calidad + "):");

        if (tipo.equalsIgnoreCase("Café")) {
            if (calidad.equalsIgnoreCase("Popular")) {
                System.out.println("1. Café Frappé - $2.50");
                System.out.println("2. Café con hielo - $2.00");
            } else {
                System.out.println("1. Cold Brew - $3.00");
                System.out.println("2. Iced Latte - $3.50");
            }
        } else if (tipo.equalsIgnoreCase("Té")) {
            if (calidad.equalsIgnoreCase("Popular")) {
                System.out.println("1. Té Helado de Limón - $2.00");
                System.out.println("2. Té Helado de Durazno - $2.20");
            } else {
                System.out.println("1. Té Helado Matcha - $3.50");
                System.out.println("2. Té Helado Earl Grey - $3.00");
            }
        } else if (tipo.equalsIgnoreCase("Chocolate")) {
            if (calidad.equalsIgnoreCase("Popular")) {
                System.out.println("1. Chocolate Frío con Leche - $2.50");
                System.out.println("2. Batido de Chocolate - $3.00");
            } else {
                System.out.println("1. Chocolate Helado Gourmet - $3.50");
                System.out.println("2. Frappé de Chocolate Amargo - $4.00");
            }
        } else {
            System.out.println("Tipo de bebida no reconocida.");
        }
    }
}