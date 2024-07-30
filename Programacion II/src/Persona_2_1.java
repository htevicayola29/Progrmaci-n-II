public class Persona_2_1 {
    String nombre;
    String apellidos;
    String numeroDocumentoIdentidad;
    int anoNacimiento;
    String paisDeNacimiento;
    char genero;
    Persona_2_1(String nombre, String apellidos, String numeroDocumentoIdentidad, int anoNacimiento,String paisDeNacimiento,char genero) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.anoNacimiento = anoNacimiento;
        this.paisDeNacimiento=paisDeNacimiento;
        this.genero=genero;
    }
    void imprimirDatos() {
        System.out.println("nombre: "+nombre);
        System.out.println("apellidos: "+apellidos);
        System.out.println("numeroDocumentoIdentidad: "+numeroDocumentoIdentidad);
        System.out.println("añoNacimiento: "+anoNacimiento);
        System.out.println("Pais de nacimiento: "+paisDeNacimiento);
        System.out.println("Genero: "+genero);
    }
}
