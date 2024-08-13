package Clase_Objeto;

import java.util.concurrent.Callable;

public class Coche {
    String color;
    String marca;
    int km;
    public static void main(String[]args){
     Coche coche=new Coche();
     coche.color="Azul";
     coche.marca="Toyota";
     coche.km=150;
        System.out.println("El color del coche es: "+coche.color);
        System.out.println("La marca del coche es: "+coche.marca);
        System.out.println("El kim del coche es: "+coche.km);

    }
}
