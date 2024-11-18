package Preparacion_Bebidas;

public class PreparacionDeBebida {
    private int tiempoEstimado; // Tiempo estimado de preparación en segundos
    private int tiempoTranscurrido; // Tiempo transcurrido en segundos
    private String estadoPreparacion; // Estado actual: "En preparación", "Completado", etc.

    // Constructor
    public PreparacionDeBebida(int tiempoEstimado) {
        this.tiempoEstimado = tiempoEstimado;
        this.tiempoTranscurrido = 0;
        this.estadoPreparacion = "En preparación";
    }

    // Método para iniciar la preparación
    public void iniciarPreparacion() {
        System.out.println("Iniciando preparación de la bebida...");
        for (int i = 1; i <= tiempoEstimado; i++) {
            try {
                Thread.sleep(1000); // Simula un segundo de tiempo transcurrido
                tiempoTranscurrido = i;
                System.out.println("Tiempo transcurrido: " + tiempoTranscurrido + " segundos");
            } catch (InterruptedException e) {
                System.out.println("Error durante la simulación del tiempo.");
            }
        }
        estadoPreparacion = "Completado";
        System.out.println("La preparación de la bebida ha sido completada.");
    }

    // Método para mostrar el estado de la preparación
    public String obtenerEstadoPreparacion() {
        return estadoPreparacion;
    }

    // Método para mostrar el tiempo estimado
    public int getTiempoEstimado() {
        return tiempoEstimado;
    }

    // Método para mostrar el tiempo transcurrido
    public int getTiempoTranscurrido() {
        return tiempoTranscurrido;
    }
}
