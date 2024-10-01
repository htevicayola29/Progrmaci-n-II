package Ejercicio_propuesto4_8;

public class Triangulo {
    double ladoA;
    double ladoB;
    double ladoC;

    public Triangulo(double ladoA, double ladoB, double ladoC) {
        if (ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {
            this.ladoA = ladoA;
            this.ladoB = ladoB;
            this.ladoC = ladoC;
        } else {
            throw new IllegalArgumentException("Los lados no forman un triangulo valido");
        }
    }
        public double calculaPerimetro(){
            return ladoA+ladoB+ladoC;
    }
    public  double calcularArea(){
        double semiperimetro=calculaPerimetro()/2;
        return  Math.sqrt(semiperimetro*(semiperimetro-ladoA)*(semiperimetro-ladoB)*(semiperimetro-ladoC));
    }
    public String toString(){
        return "triangulo [ladoA: "+ladoA+",ladoB: "+ladoB+",ladoC: "+ladoC+"]";
    }
}

