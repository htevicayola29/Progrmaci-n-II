package ejercicio_propuesto4_2;

public abstract class Perro extends Mascota {
    protected double peso;
    protected boolean muerde;

    public Perro(String nombre, int edad, String color, double peso, boolean muerde) {
        super(nombre, edad, color);
        this.peso = peso;
        this.muerde = muerde;
    }
    public static void sonido() {
        System.out.println("Los perros ladran.");
    }
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Peso: " + peso + " kg, Muerde: " + (muerde ? "Sí" : "No"));
    }

}