package Controlador;

import java.util.Scanner;

public class UsuarioControlador {
     private UsuarioDAO;
     private UsuarioVista;

    public UsuarioControlador(UsuarioDAO usuarioDAO,UsuarioVista usuarioVista) {
        this.usuarioDAO=usuarioDAO;
        this.usuarioVista=usuarioVista;
    }
    public void  listarUsuarios(){
        List<Usuario>usuarios=usuarioDAO.obtenerUsuarios();
        usuarioVista.mostrarUsarios(usuarios);
    }
    public void agregarUsario()trows SQLException{
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
        String nombre=sc.nextLine();
        System.out.println("Ingrese el correo : ");
        String email=sc.nextLine();
        usuarioDAO.agregarUsuario(nombre,email);
        System.out.println("Usuario agregado con exito.");
    }
}
