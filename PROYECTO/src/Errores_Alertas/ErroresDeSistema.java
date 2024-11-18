package Errores_Alertas;

public class ErroresDeSistema {
    public static void mostrarError(String mensaje) {
        System.out.println("ERROR CRÍTICO: " + mensaje);
        System.out.println("Por favor, contacte con el soporte técnico.");
    }
}
