package Ejercicio2_4;

public class Rombo {
    double diagonalMayor;
    double diagonalMenor;
    double lado;
    Rombo(double diagonalMayor,double diagonalMenor,double lado){
        this.diagonalMayor=diagonalMayor;
        this.diagonalMenor=diagonalMenor;
        this.lado=lado;
    }
    public double calcularArea(){
        return(diagonalMayor*diagonalMenor)/2;
    }
    public double calcularPerimetro(){
        return 4*lado;
    }
}
