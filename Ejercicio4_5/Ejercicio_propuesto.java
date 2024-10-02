package Ejercicio4_5;

public class Ejercicio_propuesto {
    /*public class Prueba {
public static void main(String[] args) {
Profesor profesor1 = new ProfesorTitular();
ProfesorTitular profesor2 = (Profesor) profesor1;
profesor2.imprimir();

    public class Prueba {
        public static void main(String[] args) {
            Profesor profesor1 = new ProfesorTitular();
            ProfesorTitular profesor2 = (Profesor) profesor1;
            profesor2.imprimir();
        }
    }*/
    public class Prueba {
        public static void main(String[] args) {
            Profesor profesor1 = new ProfesorTitular();
            ProfesorTitular profesor2 = (ProfesorTitular) profesor1;
            profesor2.imprimir();
        }
    }
}