package Transacciones;

import java.util.Scanner;

public class TipoDeTransaccion {
    private double total;  // Total de la transacción
    private String tipoPago;  // Tipo de pago (Efectivo o Electrónico)
    private String metodoPago;  // Método de pago específico (Monedas, Billetes, Tarjetas, QR)

    // Constructor
    public TipoDeTransaccion() {
        this.total = 0.0;
        this.tipoPago = "";
        this.metodoPago = "";
    }

    // Método para seleccionar el tipo de pago (Efectivo o Electrónico)
    public void seleccionarTipoPago() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el tipo de pago:");
        System.out.println("1. Efectivo");
        System.out.println("2. Electrónico");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                tipoPago = "Efectivo";
                seleccionarMetodoEfectivo();
                break;
            case 2:
                tipoPago = "Electrónico";
                seleccionarMetodoElectronico();
                break;
            default:
                System.out.println("Opción no válida. Seleccione 1 o 2.");
                seleccionarTipoPago();
                break;
        }
    }

    // Método para seleccionar el tipo de pago en efectivo (Monedas o Billetes)
    public void seleccionarMetodoEfectivo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el tipo de pago en efectivo:");
        System.out.println("1. Monedas");
        System.out.println("2. Billetes");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                metodoPago = "Monedas";
                break;
            case 2:
                metodoPago = "Billetes";
                break;
            default:
                System.out.println("Opción no válida. Seleccione 1 o 2.");
                seleccionarMetodoEfectivo();
                break;
        }

        System.out.println("Pago realizado con " + metodoPago);
    }

    // Método para seleccionar el tipo de pago electrónico (Tarjetas o Código QR)
    public void seleccionarMetodoElectronico() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el método de pago electrónico:");
        System.out.println("1. Tarjeta");
        System.out.println("2. Código QR");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                metodoPago = "Tarjeta";
                break;
            case 2:
                metodoPago = "Código QR";
                break;
            default:
                System.out.println("Opción no válida. Seleccione 1 o 2.");
                seleccionarMetodoElectronico();
                break;
        }

        System.out.println("Pago realizado con " + metodoPago);
    }

    // Método para preguntar si el usuario quiere factura
    public void preguntarFactura() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Desea recibir una factura? (sí/no):");
        String respuesta = scanner.nextLine();

        if (respuesta.equalsIgnoreCase("sí") || respuesta.equalsIgnoreCase("si")) {
            generarFactura();  // Generar factura si el usuario quiere
        } else {
            System.out.println("Gracias por usar la máquina expendedora. ¡Que tenga un buen día!");
        }
    }

    // Método para generar la factura
    public void generarFactura() {
        System.out.println("\nFactura:");
        System.out.println("Tipo de pago: " + tipoPago);
        System.out.println("Método de pago: " + metodoPago);
        System.out.println("Total a pagar: $" + total);

        // Aquí podrías agregar más detalles, como impuestos, descuentos, etc.
    }

    // Método para establecer el total de la transacción
    public void establecerTotal(double total) {
        this.total = total;
    }

    // Métodos Getters
    public double getTotal() {
        return total;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public String getMetodoPago() {
        return metodoPago;
    }
}
