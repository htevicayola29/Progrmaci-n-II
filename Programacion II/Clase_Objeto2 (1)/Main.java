package Clase_Objeto3.Clase_Objeto2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
       int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite num1"));
       int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite num2"));

        Operaciones objeto = new Operaciones();

        objeto.sumar(numero1,numero2);
        objeto.restar(numero1,numero2);
        objeto.multiplicar(numero1,numero2);
        objeto.dividir(numero2,numero2);
        objeto.mostrarResultado();
    }
}
