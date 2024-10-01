package Ejercicio4_8;

public class Velocista extends Ciclista {
    private  double potencialPromedio;
    private double velocidadPromedio;

    public Velocista(int identificador, String nombre, double potencialPromedio, double velocidadPromedio) {
        super(identificador, nombre);
        this.potencialPromedio = potencialPromedio;
        this.velocidadPromedio = velocidadPromedio;
    }

    public double getPotencialPromedio() {
        return potencialPromedio;
    }

    public void setPotencialPromedio(double potencialPromedio) {
        this.potencialPromedio = potencialPromedio;
    }

    public double getVelocidadPromedio() {
        return velocidadPromedio;
    }

    public void setVelocidadPromedio(double velocidadPromedio) {
        this.velocidadPromedio = velocidadPromedio;
    }
    protected void imprimir(){
        super.imprimir();
        System.out.println("Potencial promedio: "+potencialPromedio);
        System.out.println("Veloidad promedio: "+velocidadPromedio);
    }
    protected  String imprimirTipo(){
        return "Es un velocista";
    }
}
