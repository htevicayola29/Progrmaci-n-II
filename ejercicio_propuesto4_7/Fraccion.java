package ejercicio_propuesto4_7;

public class Fraccion extends  Numerica{
    private int numerador;
    private int denominador;
    public Fraccion(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("El denominador no puede ser cero.");
        }
        this.numerador = numerador;
        this.denominador = denominador;
    }
    public String toString() {
        return numerador + "/" + denominador;
    }
    public boolean equals(Object ob) {
        if (this == ob) return true;
        if (ob instanceof Fraccion) {
            Fraccion f = (Fraccion) ob;
            return this.numerador * f.denominador == this.denominador * f.numerador;
        }
        return false;
    }
    public Numerica sumar(Numerica numero) {
        if (numero instanceof Fraccion) {
            Fraccion f = (Fraccion) numero;
            int nuevoNumerador = this.numerador * f.denominador + f.numerador * this.denominador;
            int nuevoDenominador = this.denominador * f.denominador;
            return new Fraccion(nuevoNumerador, nuevoDenominador);
        }
        return null;
    }
    public Numerica restar(Numerica numero) {
        if (numero instanceof Fraccion) {
            Fraccion f = (Fraccion) numero;
            int nuevoNumerador = this.numerador * f.denominador - f.numerador * this.denominador;
            int nuevoDenominador = this.denominador * f.denominador;
            return new Fraccion(nuevoNumerador, nuevoDenominador);
        }
        return null;
    }
    public Numerica multiplicar(Numerica numero) {
        if (numero instanceof Fraccion) {
            Fraccion f = (Fraccion) numero;
            int nuevoNumerador = this.numerador * f.numerador;
            int nuevoDenominador = this.denominador * f.denominador;
            return new Fraccion(nuevoNumerador, nuevoDenominador);
        }
        return null;
    }
    public Numerica dividir(Numerica numero) {
        if (numero instanceof Fraccion) {
            Fraccion f = (Fraccion) numero;
            if (f.numerador == 0) {
                throw new IllegalArgumentException("No se puede dividir entre cero.");
            }
            int nuevoNumerador = this.numerador * f.denominador;
            int nuevoDenominador = this.denominador * f.numerador;
            return new Fraccion(nuevoNumerador, nuevoDenominador);
        }
        return null;
    }
}

