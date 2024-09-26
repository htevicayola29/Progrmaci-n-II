package ejercicio_propuesto4_2;

public class PerroGrande extends Perro {
    private String raza;
    public PerroGrande(String nombre, int edad, String color, double peso, boolean muerde, String raza) {
        super(nombre, edad, color, peso, muerde);
        this.raza = raza;
    }
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Raza: " + raza + " (Perro grande)");
    }
}