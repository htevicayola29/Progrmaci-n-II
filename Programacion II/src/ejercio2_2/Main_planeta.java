package ejercio2_2;

public class Main_planeta {
    public static void main(String[] args) {
        planeta p1 = new planeta("Tierra", 1, 5.9736E24, 1.08321E12, 12742, 150000000, planeta.tipoPlaneta.TERRESTRE, true,5,250);
        p1.imprimirDatos();
        System.out.println("Dencidad del planeta: " + p1.calcularDensidad());
        System.out.println("Es planeta exterior: " + p1.esPlanetaExterior());
        System.out.println("");
        planeta p2 = new planeta("Jupiter", 79, 1.899E27, 1.4313E15, 139820, 750000000, planeta.tipoPlaneta.GASEOSO, true,10,365);
        p2.imprimirDatos();
        System.out.println("Densidad del planeta: " + p2.calcularDensidad());
        System.out.println("Es planeta exterior: " + p2.esPlanetaExterior());

    }

}


