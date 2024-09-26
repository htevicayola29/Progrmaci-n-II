package ejercicio_propuesto4_1;
class Novela extends Libro {
    private String tipo;
    public Novela(String titulo, String autor, double precio, String tipo) {
        super(titulo, autor, precio);
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Tipo de novela: " + tipo);
    }
}
