package ejercicio_propuesto4_2;


public class GatoPeloLargo extends Gato {
    private String raza;
    public GatoPeloLargo(String nombre, int edad, String color, double alturaSalto, double longitudSalto, String raza) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.raza = raza;
    }
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Raza: " + raza + " (Gato de pelo largo)");
    }
}