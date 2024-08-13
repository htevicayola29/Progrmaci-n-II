package Clase_Objeto2;

import javax.swing.*;

public class Operaciones {
    int numero1;
    int numero2;
    int suma, resta, multiplicacion, division;

    public void LeerNumeros() {
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite num1"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite num2"));
    }

    public void sumar() {
        suma = numero1 + numero2;
    }

    public void restar() {
        resta = numero1 - numero2;
    }
    public void multiplicar(){
        multiplicacion=numero1*numero2;
    }
    public void dividir(){
        division=numero1/numero2;
    }
    public void mostrarResultado(){
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La suma es: "+division);
    }
}