package ejercicio4_2;
public class Apartaestudio extends Apartamento {
    protected static double valorArea = 1500000;

    public Apartaestudio(int identificadorInmobiliario, int area,
                         String direccion, int numeroHabitaciones, int numeroBanos) {
        super(identificadorInmobiliario, area, direccion, numeroHabitaciones, numeroBanos);
    }
    void imprimir() {
        super.imprimir();
        System.out.println();
    }
}
