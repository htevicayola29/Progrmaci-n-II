package Ejercicio4_6;

public class ProfesorTitular extends Profesor {
    int años = 0;
    protected void imprimir() {
        System.out.println("Es un profesor titular.");
    }
    protected void imprimirAños() {
        System.out.println("Años = " + años);
    }
}