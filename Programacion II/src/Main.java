
import controlador.UsuarioControlador;
import database.ConexionDB;
import vista.UsuarioVista;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try{
            Connection conexion =Connection.getConnection();
            UsuarioDAO  usuarioDAO=new UsuarioDAO();
            UsuarioVista usuarioVista=new UsuarioVista();
            UsuarioControlador usuarioControlador=new  usuarioControlador(usuarioDAO,usuarioVista);

            Scanner scanner= new Scanner(System.in);
            int opcion;
            do{
                System.out.println("\n=== Menu de Gestacion de Usuarios ===");

                System.out.println("1. Mostrar usuarios ");

                System.out.println("2. Agregar usuario");

                System.out.println("0.Salir");

                System.out.print("Selecciona una opcion : ");
                opcion=scanner.nextInt();
                switch (opcion){
                    case 1:
                        usuarioControlador.listarUsuarios();
                        break;;
                    case 2:
                        usuarioControlador.agregarUsuario();
                        break;
                    case 0 :
                        System.out.println("Saliendo del Sistema....");
                        break;
                    default:
                        System.out.println("Opcion no valida. Intente de nuevo.");
                        break;
                }
            }while (opcion !=0);
            ConexionBD.cerrarConexion();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
