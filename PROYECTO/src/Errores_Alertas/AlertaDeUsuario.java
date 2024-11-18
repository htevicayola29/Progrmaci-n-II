package Errores_Alertas;

public class AlertaDeUsuario {
    public static void mostrarAdvertencia(String mensaje) {
        System.out.println("ADVERTENCIA: " + mensaje);
        System.out.println("Por favor, revise su selección.");
    }

    // Método para mostrar alertas de selección incorrecta
    public static void mostrarSelecciónIncorrecta() {
        System.out.println("ADVERTENCIA: Selección incorrecta. Por favor, elija una opción válida.");
    }
}
