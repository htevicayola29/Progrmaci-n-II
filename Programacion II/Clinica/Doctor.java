package Clinica;

public class Doctor {
    private String nombre;
    private String email;
    private String especialidad;
    private String telefono;

    public Doctor() {
    }

    public Doctor(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono.length() >= 8) {
            System.out.println("Solo admite 8 digitos");
        } else {
            this.telefono = telefono;
        }
    }
}