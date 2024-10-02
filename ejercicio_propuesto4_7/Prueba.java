package ejercicio_propuesto4_7;

public class Prueba {

    public static void main(String[] args) {
        Fraccion fraccion1 = new Fraccion(1, 2); // 1/2
        Fraccion fraccion2 = new Fraccion(3, 4); // 3/4

        System.out.println("Fracción 1: " + fraccion1);
        System.out.println("Fracción 2: " + fraccion2);

        Numerica suma = fraccion1.sumar(fraccion2);
        System.out.println("Suma: " + suma);

        Numerica resta = fraccion1.restar(fraccion2);
        System.out.println("Resta: " + resta);

        Numerica multiplicacion = fraccion1.multiplicar(fraccion2);
        System.out.println("Multiplicación: " + multiplicacion);

        Numerica division = fraccion1.dividir(fraccion2);
        System.out.println("División: " + division);

        System.out.println("¿Son iguales? " + fraccion1.equals(fraccion2));
    }
}
