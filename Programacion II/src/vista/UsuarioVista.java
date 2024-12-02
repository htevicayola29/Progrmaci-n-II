package vista;
import  modelo.Usuario;
import  modelo.UsuarioDAO;
import  java.util.List;
public class UsuarioVista {
    public void  mostrarUsuarios(List<Usuario>usuarios){
        System.out.println("\n*** Lista de  Usuarios***");
        if(usuarios.isEmpty()){
            System.out.println("No hay usuarios registrados.");
        }else {
            System.out.println("%5s %15s %25s\n","ID","NOMBRE","EMAIL");
            for(Usuario usuario: usuarios){
                System.out.println("%5s %15 %25\n", usuario.getId(),usuario.getNombre(),usuario.getEmail());
            }
        }
    }
}
