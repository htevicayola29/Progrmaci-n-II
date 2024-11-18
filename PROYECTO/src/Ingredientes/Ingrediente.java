package Ingredientes;

public class Ingrediente {
    private String nombre;
    private int cantidad; // Cantidad en unidades (por ejemplo, cucharadas, ml, etc.)

    // Constructor
    public Ingrediente(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    // Método para reducir la cantidad del ingrediente
    public void consumir(int cantidad) {
        if (this.cantidad >= cantidad) {
            this.cantidad -= cantidad;
        } else {
            System.out.println("No hay suficiente " + nombre + " disponible.");
        }
    }

    // Método para reponer el ingrediente
    public void reponer(int cantidad) {
        this.cantidad += cantidad;
    }

    @Override
    public String toString() {
        return nombre + ": " + cantidad + " unidades";
    }
}
