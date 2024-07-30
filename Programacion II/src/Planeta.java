public class Planeta {
    String nombre = null;
    int cantidadSatelites = 0;
    double masa = 0;
    double volumen = 0;
    int diametro = 0;
    int distanciaSol = 0;
    enum tipoPlaneta {GASEOSO, TERRESTRE, ENANO}

    tipoPlaneta tipo;
    boolean esObservable = false;
    int periodo_Orbital;
    int periodo_Rotacion;

    Planeta(String nombre, int cantidadSatelites, double masa, double volumen, int diametro, int distanciaSol, tipoPlaneta tipo, boolean esObservable,int periodo_Orbital,int periodo_Rotacion ) {
        this.nombre = nombre;
        this.cantidadSatelites = cantidadSatelites;
        this.masa = masa;
        this.volumen = volumen;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
        this.tipo = tipo;
        this.esObservable = esObservable;
        this.periodo_Orbital=periodo_Orbital;
        this.periodo_Rotacion=periodo_Rotacion;
    }

    void imprimirDatos() {
        System.out.println("Nombre del planeta: " + nombre);
        System.out.println("Cantidad de Satelites: " + cantidadSatelites);
        System.out.println("Masa de planeta: " + masa);
        System.out.println("Volumen del planeta: " + volumen);
        System.out.println("Diametro del planeta: " + diametro);
        System.out.println("Distancia al Sol: " + distanciaSol);
        System.out.println("Tipo de planeta: " + tipo);
        System.out.println("Es observable: " + esObservable);
        System.out.println("Años de periodo orbital: " +periodo_Orbital);
        System.out.println("Dias de periodo de rotacion: "+periodo_Rotacion);
    }

    double calcularDensidad() {
        return masa / volumen;
    }

    boolean esPlanetaExterior() {
        float limite=(float)(149597870* 3.4);
        if (distanciaSol>limite){
            return true;
        }else{
            return false;
        }
    }

}