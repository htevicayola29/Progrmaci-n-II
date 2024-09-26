package ejercicio_propuesto4_2;

public class GatoSinPelo extends Gato {
    private String raza;
    public GatoSinPelo(String nombre, int edad, String color, double alturaSalto, double longitudSalto, String raza) {
        super(nombre, edad, color, alturaSalto, longitudSalto);
        this.raza = raza;
    }
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Raza: " + raza + " (Gato sin pelo)");
    }
}





