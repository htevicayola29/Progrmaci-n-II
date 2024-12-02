package modelo;

import  database.ConexionDB;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
     public List<Usuario> obtenerUsuarios(){
         List<Usuario> usuarios=new ArrayList<>();
         String sql ="SELECT id,nombre,email FROM usuarios";

         try(Connection conexion= ConexionDB.getConnection();
             PreparedStatement statement= conexion.prepareStatement(sql);
             ResultSet resultSet= statement.executeQuery()){

             while (resultSet.next()){
                 int id=resultSet.getInt("id");
                 String nombre= resultSet.getString("nombre");
                 String email= resultSet.getString("email");
                 Usuario usuario =new Usuario(id,nombre,email);
                 usuarios.add(usuario);
             }
         }catch (SQLException e){
             throw new RuntimeException("Error al obtener los usuarios"+e.getMessage(),e);
         }
         return  usuarios ;
     }
     public void  agregarUsuario(String nombre,String email) throws SQLException{
         String sql ="INSERT INTO usuarios(nombre,email) VALUES(?,?)";
         try (Connection conexion =ConexionDB.getConnection();
              PreparedStatement stmt=conexion.prepareStatement(sql)){
             stmt.setString(1,nombre);
             stmt.setString(2,email);
             stmt.executeUpdate();
         } catch (SQLException e){
             throw  new  RuntimeException("Error al obtener los usuarios"+e.getMessage(),e);

         }
     }
}
