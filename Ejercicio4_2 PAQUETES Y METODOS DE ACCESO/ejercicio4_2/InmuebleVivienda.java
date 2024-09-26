package ejercicio4_2;
public class InmuebleVivienda extends Inmueble {
    protected int numeroHabitaciones;
    protected int numeroBanos;
    public InmuebleVivienda(int identificadorInmobiliario, int area, String
            direccion, int numeroHabitaciones, int numeroBanos) {
        super(identificadorInmobiliario, area, direccion);
        this.numeroHabitaciones= numeroHabitaciones;
        this.numeroBanos = numeroBanos;
    }
    void imprimir() {
        super.imprimir();
        System.out.println("Número de habitaciones : " + numeroHabitaciones);
        System.out.println("Número de baños : " + numeroBanos);
    }
}

