package Ejercicio4_8;

public class Contrarrelogista extends Ciclista{
    private  double velocidadMaxima;
    public Contrarrelogista(int identificador, String nombre, double velocidadMaxima) {
        super(identificador, nombre);
        this.velocidadMaxima = velocidadMaxima;
    }
    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }
    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    protected void imprimir(){
        super.imprimir();
        System.out.println("Aceleracion promedio: "+velocidadMaxima);
    }
    protected String imprimirTipo(){
        return "Es un contrarrelojista";
    }
}
