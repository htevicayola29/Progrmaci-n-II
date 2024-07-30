package Ejercicio2_4;

public class PruebaFiguras {
    public static void main(String[] args) {
        Circulo figura1 = new Circulo(2);
        Rectangulo figura2 = new Rectangulo(1,2);
        Cuadrado figura3 = new Cuadrado(3);
        TrianguloRectangulo figura4 = new TrianguloRectangulo(3,5);
        Rombo figura5=new Rombo(6,3,2);
        Trapecio figura6=new Trapecio(5,3,6,6,7);
        System.out.println("El area del circulo es: "+figura1.calcularArea());
        System.out.println("El perimetro del circulo es :"+figura1.calcularPerimetro());
        System.out.println();
        System.out.println("El área del rectángulo es = " + figura2.calcularArea());
        System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerimetro());
        System.out.println();
        System.out.println("El área del cuadrado es = " + figura3.calcularArea());
        System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerimetro());
        System.out.println();
        System.out.println("El área del triángulo es = " + figura4.calcularArea());
        System.out.println("El perímetro del triángulo es = " + figura4.calcularPerimetro());
        figura4.determinarTipoTriangulo();
        System.out.println("El area del rombo es= "+figura5.calcularArea());
        System.out.println("El perimetro del rombo es = "+figura5.calcularPerimetro());
        System.out.println();
        System.out.println("El area el trapecio es= "+figura6.calcularArea());
        System.out.println("El parametro del trapecio es = "+figura6.calcularPerimetro());
        System.out.println();
    }
}
