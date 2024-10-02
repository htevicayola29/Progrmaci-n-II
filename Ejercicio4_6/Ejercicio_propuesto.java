package Ejercicio4_6;

import java.util.Vector;
public class Ejercicio_propuesto {
    /*¿Cuál es el resultado de la ejecución del siguiente programa basado
    en el ejercicio anterior?*/

    /*Vector profesores;
public static void main(String[] args) {
    Prueba prueba = new Prueba();
    prueba.profesores = new Vector();
    Profesor profesor1 = new Profesor();
    ProfesorTitular profesor2 = new ProfesorTitular();
    prueba.profesores.add(profesor1);
    prueba.profesores.add(profesor2);
    for(int i = 0; i < prueba.profesores.size(); i++) {
        Profesor p = (Profesor) prueba.profesores.elementAt(i);
        p.imprimir();
    }*/


    /*correciones*/

    public class Prueba {
        Vector <Profesor> profesores;

        public  void main(String[] args) {
            Prueba prueba= new Prueba();
            prueba.profesores = new Vector<>();
            Profesor profesor1 = new Profesor();
            ProfesorTitular profesor2 = new ProfesorTitular();
            prueba.profesores.add(profesor1);
            prueba.profesores.add(profesor2);
            for (int i = 0; i < prueba.profesores.size(); i++) {
                Profesor p = (Profesor) prueba.profesores.elementAt(i);
                p.imprimir();
            }
        }
    }
}
