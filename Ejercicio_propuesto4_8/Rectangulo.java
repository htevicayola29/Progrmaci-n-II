package Ejercicio_propuesto4_8;

public class Rectangulo {
    int base;
    int altura;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    double calcularArea(){
       return  base*altura;
    }
    double calcularPerimetro(){
        return (2*base)+(2*altura);
    }
}
