package ejercicio_propuesto4_3;

public class Main {
    public static void main(String[] args) {

        Estudiante estudiante = new Estudiante("Ana Martínez", "Calle 123",
                "Medicina", 3);
        System.out.println("Estudiante: " + estudiante.getNombre());
        System.out.println("Dirección: " + estudiante.getDireccion());
        System.out.println("Carrera: " + estudiante.getCarrera());
        System.out.println("Semestre: " + estudiante.getSemestre());

        Profesor profesor = new Profesor("Luis Herrera", "Avenida 456",
                "Física", "Asociado");
        System.out.println("\nProfesor: " + profesor.getNombre());
        System.out.println("Dirección: " + profesor.getDireccion());
        System.out.println("Departamento: " + profesor.getDepartamento());
        System.out.println("Categoría: " + profesor.getCategoria());
    }
}

