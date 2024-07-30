public class Cliente_1 {
    int codigo;
    String nombre;
    int telefono;

    Cliente_1() {

    }

    Cliente_1(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    Cliente_1(int codigo, String nombre, int telefono) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.telefono = telefono;
    }


    public void imprimirDatos() {
        System.out.println("codigo: " + codigo);
        System.out.println("nombre: " + nombre);
        System.out.println("telefono: " + telefono);
    }
}

