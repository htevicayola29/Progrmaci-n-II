package ejercicio_propuesto4_1;

public class Main {
    public static void main(String[] args) {

        Libro libro = new Libro("Cien años de soledad", "Gabriel García Márquez", 120.0);
        libro.imprimirInfo();
        LibroTexto libroTexto = new LibroTexto("Matemáticas básicas", "Juan Pérez", 85.0, "Matemáticas");
        libroTexto.imprimirInfo();
        LibroTextoUNAL libroUNAL = new LibroTextoUNAL("Física moderna", "Ana Gómez", 150.0, "Física", "Facultad de Ciencias");
        libroUNAL.imprimirInfo();
        Novela novela = new Novela("1984", "George Orwell", 60.0, "Ciencia Ficción");
        novela.imprimirInfo();
    }
}
