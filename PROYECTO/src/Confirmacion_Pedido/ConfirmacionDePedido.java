package Confirmacion_Pedido;

import Utilidades.InputHelper;

import java.util.Map;

public class ConfirmacionDePedido {
    private boolean pedidoConfirmado; // Indica si el pedido ha sido confirmado o cancelado

    // Constructor vacío
    public ConfirmacionDePedido() {
        this.pedidoConfirmado = false;
    }

    // Método para confirmar el pedido
    public boolean confirmarPedido(Map<String, Integer> bebidasSeleccionadas) {
        // Mostrar resumen del pedido
        System.out.println("\nResumen del pedido:");
        for (Map.Entry<String, Integer> entry : bebidasSeleccionadas.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " unidad(es)");
        }

        // Preguntar al usuario si confirma el pedido
        System.out.println("\n¿Confirma su pedido? (S/N):");
        String respuesta = InputHelper.leerTexto("");
        if (respuesta.equalsIgnoreCase("S")) {
            pedidoConfirmado = true;
            System.out.println("Pedido confirmado.");
        } else {
            pedidoConfirmado = false;
            System.out.println("Pedido cancelado.");
        }
        return pedidoConfirmado;
    }
}
