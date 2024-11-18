package SQLConection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConexionDB {
    private static final String URL = "jdbc:mysql://localhost:3306/maquina_expendedora";  // URL de la base de datos
    private static final String USER = "";  // Usuario vacío
    private static final String PASSWORD = "";  // Contraseña vacía
    private static Connection connection = null;

    // Método para obtener la conexión
    public static Connection getConnection() {
        try {
            if (connection == null || connection.isClosed()) {
                // Establecer la conexión con usuario y contraseña vacíos
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Conexión exitosa a la base de datos.");
            }
        } catch (SQLException e) {
            System.out.println("ERROR: No se pudo establecer la conexión con la base de datos.");
            e.printStackTrace();
        }
        return connection;
    }

    // Método para cerrar la conexión
    public static void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
                System.out.println("Conexión cerrada con éxito.");
            }
        } catch (SQLException e) {
            System.out.println("ERROR: No se pudo cerrar la conexión.");
            e.printStackTrace();
        }
    }
}
