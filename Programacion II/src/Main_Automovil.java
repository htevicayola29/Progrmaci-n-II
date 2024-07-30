public class Main_Automovil {public static void main(String args[]) {
    Automovil auto1 = new Automovil("Ford",2018,3, Automovil.tipoCom.DIESEL, Automovil.tipoA.EJECUTIVO,5,6,250, Automovil.tipoColor.NEGRO,true, 5);
    auto1.imprimir();
    auto1.setVelocidadActual(100);
    System.out.println("Velocidad actual = " + auto1.velocidadActual);
    auto1.acelerar(120);
    System.out.println("¿El automovil tiene multas?:  "+ auto1.tieneMultas());
    auto1.desacelerar(50);
    System.out.println("Total de las multas de infraccion del automovil: " + auto1.totalMultas());
    auto1.frenar();
    System.out.println("Velocidad actual = " + auto1.velocidadActual);
    auto1.desacelerar(20);
}

}
