package ejercicio_propuesto4_2;

public class Main {
    public static void main(String[] args) {

        PerroPequeño schnauzer = new PerroPequeño("Max", 3, "Gris",
                7.5, false, "Schnauzer");
        schnauzer.imprimirInfo();
        Perro.sonido();

        PerroMediano dalmata = new PerroMediano("Luna", 5,
                "Blanco y negro", 25.0, true, "Dálmata");
        dalmata.imprimirInfo();
        Perro.sonido();

        PerroGrande pastorAleman = new PerroGrande("Rex", 6, "Marrón",
                40.0, true, "Pastor Alemán");
        pastorAleman.imprimirInfo();
        Perro.sonido();

        GatoSinPelo esfinge = new GatoSinPelo("Cleopatra", 2, "Rosa",
                0.5, 1.2, "Esfinge");
        esfinge.imprimirInfo();
        Gato.sonido();

        GatoPeloLargo angora = new GatoPeloLargo("Nieve", 4, "Blanco",
                0.6, 1.3, "Angora");
        angora.imprimirInfo();
        Gato.sonido();

        GatoPeloCorto azulRuso = new GatoPeloCorto("Blu", 3, "Gris", 0.7,
                1.1, "Azul Ruso");
        azulRuso.imprimirInfo();
        Gato.sonido();
    }
}

