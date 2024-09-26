package Ejercicio4_4;

public class ejercicio_propuesto4_4 {
    /*¿Cuál es el resultado de la ejecución del siguiente programa basado
     en el ejercicio anterior?*/
    public class Prueba {
        public static void main(String[] args) {
            Profesor profesor1 = new ProfesorTitular();
            Profesor profesor2 = (Profesor) profesor1;
            profesor2.imprimir();
        }
    }
}
