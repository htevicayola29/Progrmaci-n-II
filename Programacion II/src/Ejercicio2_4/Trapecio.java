package Ejercicio2_4;

public class Trapecio {
    double baseMayor;
    double baseMenor;
    double ladoIzquerdo;
    double ladoDerecho;
    double altura;

    Trapecio(double baseMayor, double baseMenor, double ladoIzquerdo, double ladoDerecho, double altura) {
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.ladoIzquerdo = ladoIzquerdo;
        this.ladoDerecho = ladoDerecho;
        this.altura = altura;
    }

    double calcularArea() {
        return ((baseMayor + baseMenor) * altura) / 2;
    }

    public double calcularPerimetro() {
        return baseMayor + baseMenor + ladoIzquerdo + ladoDerecho;
    }
}