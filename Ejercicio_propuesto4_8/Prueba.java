package Ejercicio_propuesto4_8;

public class Prueba {
    public static void main(String args[]) {
        Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1, 2);
        Cuadrado figura3 = new Cuadrado(3);
        Triangulo figura4=new Triangulo(2,3,4);
        TrianguloRectangulo figura5=new TrianguloRectangulo(2,3,3,2,3);
        System.out.println("El área del círculo es : " + figura1.calcularArea());
        System.out.println("El perímetro del círculo es : " + figura1.calcularPerimetro());
        System.out.println();
        System.out.println("El area del rectangulo es : " + figura2.calcularArea());
        System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerimetro());
        System.out.println();
        System.out.println("El área del cuadrado es : " + figura3.calcularArea());
        System.out.println("El perímetro del cuadrado es : " + figura3.calcularPerimetro());
        System.out.println();
        System.out.println("El área del triángulo es : " + figura4.calcularArea());
        System.out.println("El perímetro del triángulo es : " + figura4.calculaPerimetro());
        System.out.println();
        System.out.println("El area del triangulo rectangulo es: "+figura5.calcularArea());
        System.out.println("El perimetro del triangulo rectangulo es: "+figura5.calcularPerimetro());
        figura5.determinarTipoTriangulo();
    }
}