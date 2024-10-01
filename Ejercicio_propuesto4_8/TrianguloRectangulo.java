package Ejercicio_propuesto4_8;

public class TrianguloRectangulo extends Triangulo {
    int base;
    int altura;

    public TrianguloRectangulo(double ladoA, double ladoB, double ladoC, int base, int altura) {
        super(ladoA, ladoB, ladoC);
        this.base = base;
        this.altura = altura;
    }
    double calcularPerimetro() {
        return (base + altura + calcularHipotenusa());
    }
    public double calcularArea() {
        return super.calcularArea();
    }

    double calcularHipotenusa() {
        return Math.pow(base * base + altura * altura, 0.5);
    }
    void determinarTipoTriangulo() {
        if ((base == altura) && (base == calcularHipotenusa()) && (altura
                == calcularHipotenusa()))
            System.out.println("Es un triángulo equilátero");
        else if ((base != altura) && (base != calcularHipotenusa()) && (altura != calcularHipotenusa()))
            System.out.println("Es un triángulo escaleno");
            System.out.println("Es un triángulo isósceles");
    }

}
