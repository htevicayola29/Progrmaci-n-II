package Ingredientes;

import java.util.HashMap;
import java.util.Map;

public class Inventario {
    private Map<String, Ingrediente> ingredientes;

    // Constructor
    public Inventario() {
        ingredientes = new HashMap<>();
        inicializarInventario();
    }

    // Inicializa el inventario con ingredientes básicos
    private void inicializarInventario() {
        ingredientes.put("Azúcar", new Ingrediente("Azúcar", 50)); // 50 unidades
        ingredientes.put("Leche", new Ingrediente("Leche", 30));   // 30 ml
        ingredientes.put("Café", new Ingrediente("Café", 20));     // 20 unidades
        ingredientes.put("Té", new Ingrediente("Té", 15));         // 15 unidades
        ingredientes.put("Chocolate", new Ingrediente("Chocolate", 10)); // 10 unidades
    }

    // Obtener un ingrediente por su nombre
    public Ingrediente getIngrediente(String nombre) {
        return ingredientes.getOrDefault(nombre, null);
    }

    // Mostrar el inventario completo
    public void mostrarInventario() {
        System.out.println("Inventario actual:");
        for (Ingrediente ingrediente : ingredientes.values()) {
            System.out.println(ingrediente);
        }
    }

    // Consumir una cantidad de un ingrediente
    public void consumirIngrediente(String nombre, int cantidad) {
        Ingrediente ingrediente = getIngrediente(nombre);
        if (ingrediente != null) {
            ingrediente.consumir(cantidad);
        } else {
            System.out.println("El ingrediente " + nombre + " no existe en el inventario.");
        }
    }

    // Reponer un ingrediente
    public void reponerIngrediente(String nombre, int cantidad) {
        Ingrediente ingrediente = getIngrediente(nombre);
        if (ingrediente != null) {
            ingrediente.reponer(cantidad);
        } else {
            System.out.println("El ingrediente " + nombre + " no existe en el inventario.");
        }
    }
}
