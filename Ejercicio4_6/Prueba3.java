package Ejercicio4_6;

public class Prueba3 {
    public static void main(String[] args) {
       /* Profesor profesor1 = new ProfesorTitular();
        profesor1.imprimirAños();*/
        Profesor profesor1 = new ProfesorTitular();
        ProfesorTitular profesor2 = (ProfesorTitular) profesor1;
        profesor2.imprimirAños();

    }
}
