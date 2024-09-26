package ejercicio_propuesto4_1;

class LibroTexto extends Libro {
    private String curso;

    // Constructor
    public LibroTexto(String titulo, String autor, double precio, String curso) {
        super(titulo, autor, precio);
        this.curso = curso;
    }

    // Método getter y setter para curso
    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Curso asociado: " + curso);
    }
}

