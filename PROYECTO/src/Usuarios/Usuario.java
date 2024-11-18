package Usuarios;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.Map;

import Utilidades.InputHelper;
public class Usuario {
    private String nombre;
    private int maxBebidas;
    private Map<String, Integer> bebidasSeleccionadas;

    // Constructor
    public Usuario(String nombre) {
        this.nombre = nombre;
        this.bebidasSeleccionadas = new HashMap<>();
        this.maxBebidas = obtenerMaxBebidasDesdeBD(); // Obtiene el límite desde la base de datos
    }

    // Método para obtener el máximo de bebidas que un usuario puede pedir desde la base de datos
    private int obtenerMaxBebidasDesdeBD() {
        int maxBebidas = 5; // Valor predeterminado
        try (Connection conn = ConexionBD.obtenerConexion()) { // Usamos la clase ConexionBD
            // Consulta para obtener el máximo de bebidas desde la base de datos
            String query = "SELECT max_bebidas FROM configuraciones WHERE id = 1";
            PreparedStatement stmt = conn.preparedStatement(query);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                maxBebidas = rs.getInt("max_bebidas");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return maxBebidas;
    }

    // Método para seleccionar bebidas
    public void seleccionarBebida() {
        boolean continuar = true;
        while (continuar) {
            // Verifica si el usuario ha alcanzado el límite de bebidas
            if (bebidasSeleccionadas.size() >= maxBebidas) {
                System.out.println("\nHa alcanzado el límite de " + maxBebidas + " bebidas por pedido.");
                break;
            }

            System.out.println("\nSeleccione una bebida:");
            System.out.println("1. Café");
            System.out.println("2. Té");
            System.out.println("3. Chocolate");

            int opcionBebida = InputHelper.leerEntero("Ingrese su elección (1-3):", 1, 3);

            String bebida = "";
            switch (opcionBebida) {
                case 1:
                    bebida = "Café";
                    break;
                case 2:
                    bebida = "Té";
                    break;
                case 3:
                    bebida = "Chocolate";
                    break;
            }

            // Solicita la cantidad de la bebida seleccionada
            int cantidad = InputHelper.leerEntero("Ingrese la cantidad de " + bebida + ":", 1, 10);
            if (bebidasSeleccionadas.containsKey(bebida)) {
                cantidad += bebidasSeleccionadas.get(bebida); // Si la bebida ya fue seleccionada, se acumula la cantidad
            }
            bebidasSeleccionadas.put(bebida, cantidad);

            // Pregunta si el usuario desea agregar más bebidas
            System.out.println("¿Desea agregar otra bebida? (S/N):");
            String respuesta = InputHelper.leerTexto("");
            if (!respuesta.equalsIgnoreCase("S")) {
                continuar = false;
            }
        }
    }

    // Método para mostrar el resumen del pedido
    public void mostrarPedido() {
        System.out.println("\nResumen del pedido de " + nombre + ":");
        for (Map.Entry<String, Integer> entry : bebidasSeleccionadas.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " unidad(es)");
        }
    }

    // Getter para bebidas seleccionadas
    public Map<String, Integer> getBebidasSeleccionadas() {
        return bebidasSeleccionadas;
    }

    // Getter para el máximo de bebidas
    public int getMaxBebidas() {
        return maxBebidas;
    }
}
