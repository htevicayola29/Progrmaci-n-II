package Configuracion_Maquina;

public class Configuracion {
    private int maxBebidas; // Máximo de bebidas permitidas en un pedido
    private boolean permitirLeche; // Permitir elegir tipo de leche
    private boolean permitirTemperatura; // Permitir elegir temperatura
    private boolean permitirIntensidad; // Permitir elegir intensidad

    // Constructor
    public Configuracion(int maxBebidas, boolean permitirLeche, boolean permitirTemperatura, boolean permitirIntensidad) {
        this.maxBebidas = maxBebidas;
        this.permitirLeche = permitirLeche;
        this.permitirTemperatura = permitirTemperatura;
        this.permitirIntensidad = permitirIntensidad;
    }

    // Getters y Setters
    public int getMaxBebidas() {
        return maxBebidas;
    }

    public void setMaxBebidas(int maxBebidas) {
        this.maxBebidas = maxBebidas;
    }

    public boolean isPermitirLeche() {
        return permitirLeche;
    }

    public void setPermitirLeche(boolean permitirLeche) {
        this.permitirLeche = permitirLeche;
    }

    public boolean isPermitirTemperatura() {
        return permitirTemperatura;
    }

    public void setPermitirTemperatura(boolean permitirTemperatura) {
        this.permitirTemperatura = permitirTemperatura;
    }

    public boolean isPermitirIntensidad() {
        return permitirIntensidad;
    }

    public void setPermitirIntensidad(boolean permitirIntensidad) {
        this.permitirIntensidad = permitirIntensidad;
    }

    @Override
    public String toString() {
        return "Configuración de la máquina expendedora:\n" +
                "Máximo de bebidas: " + maxBebidas + "\n" +
                "Permitir tipo de leche: " + permitirLeche + "\n" +
                "Permitir elegir temperatura: " + permitirTemperatura + "\n" +
                "Permitir elegir intensidad: " + permitirIntensidad;
    }
}
