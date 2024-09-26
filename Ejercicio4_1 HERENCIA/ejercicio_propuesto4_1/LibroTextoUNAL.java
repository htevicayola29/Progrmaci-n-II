package ejercicio_propuesto4_1;

class LibroTextoUNAL extends LibroTexto {
    private String facultad;
    public LibroTextoUNAL(String titulo, String autor, double precio, String curso, String facultad) {
        super(titulo, autor, precio, curso);
        this.facultad = facultad;
    }
    public String getFacultad() {
        return facultad;
    }
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Facultad que lo publicó: " + facultad);
    }
}

