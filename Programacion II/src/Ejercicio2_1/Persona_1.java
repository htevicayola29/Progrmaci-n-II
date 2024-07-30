package Ejercicio2_1;

public class Persona_1 {
    String nombre;
    String apellidos;
    String numeroDocumentoIdentidad;
    int anoNacimiento;
    Persona_1() {
    }
    Persona_1(String nombre, String apellidos, String númeroDocumentoIdentidad, int anoNacimiento) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.numeroDocumentoIdentidad = numeroDocumentoIdentidad;
        this.anoNacimiento = anoNacimiento;
    }
    void imprimirDatos() {
        System.out.println("nombre: "+nombre);
        System.out.println("apellidos: "+apellidos);
        System.out.println("numeroDocumentoIdentidad: "+numeroDocumentoIdentidad);
        System.out.println("añoNacimiento"+anoNacimiento);
    }
}



