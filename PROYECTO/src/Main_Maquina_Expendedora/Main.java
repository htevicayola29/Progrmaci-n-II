package Main_Maquina_Expendedora;

import Bebidas.TipoDeBebida;
import Preferencias.Preferencia;
import Usuario.Usuario;
import Maquina_Expendedora.Menu;
import Transacciones.TipoDeTransacciones;
import ConfiguracionMaquina.ConfiguracionMaquina;
import ConfirmacionPedido.ConfirmacionDePedido;
import ErroresYAlertas.Advertencia;
import SQLConection.SQLConnection;
import Utilidades.InputHelper;

import java.util.Map;

public class Main {

    public static void main(String[] args) {
        // Conexión a la base de datos (opcional, según el proyecto)
        SQLConnection conectarBD = new SQLConnection();
        conectarBD.conectar();  // Método para conectar a la base de datos

        // Mostrar la configuración inicial de la máquina
        ConfiguracionMaquina configMaquina = new ConfiguracionMaquina();
        configMaquina.mostrarConfiguracion();

        // Creación del usuario
        String nombreUsuario = InputHelper.leerTexto("Ingrese su nombre de usuario:");
        Usuario usuario = new Usuario(nombreUsuario);

        // Selección de bebidas
        Menu menu = new Menu();
        menu.mostrarMenu();

        // Realizar la selección de bebidas
        TipoDeBebida tipoDeBebida = new TipoDeBebida("Café", "Popular");  // Ejemplo de tipo de bebida
        tipoDeBebida.mostrarMenuCaliente(); // Mostrar las opciones calientes

        // Configuración de las preferencias de la bebida
        Preferencia preferencia = new Preferencia();
        preferencia.seleccionarTamaño();
        preferencia.seleccionarTipoLeche(true); // Ejemplo, asume que se puede elegir leche
        preferencia.seleccionarTemperatura(true); // Ejemplo, asume que es bebida caliente
        preferencia.seleccionarIntensidad("Café");

        // Confirmar el pedido
        ConfirmacionDePedido confirmacionDePedido = new ConfirmacionDePedido();
        confirmacionDePedido.confirmarPedido(usuario);

        // Realizar el pago
        TipoDeTransacciones transaccion = new TipoDeTransacciones();
        transaccion.seleccionarMetodoDePago();

        // Confirmación final de la transacción
        System.out.println("\nProceso completado con éxito!");
        System.out.println("Gracias por su compra, " + nombreUsuario + "!");
        System.out.println("Disfrute su bebida!");

        // Error de ejemplo (si ocurre)
        if (Math.random() > 0.5) {
            // Simulación de un error aleatorio para mostrar la advertencia
            Advertencia advertencia = new Advertencia();
            advertencia.mostrarAdvertencia("Error en la máquina, por favor intente nuevamente.");
        }

        // Cierre de la conexión a la base de datos al final
        conectarBD.cerrarConexion();
    }
}