public class Automovil {
    String marca;
    int modelo;
    int motor;

    enum tipoCom {GASOLINA, BIOETANOL, DIESEL, BIODIESEL, GAS_NATURAL}

    tipoCom tipoCombustible;

    enum tipoA {CIUDAD, SUBCOMPACTO, COMPACTO, FAMILIAR, EJECUTIVO, SUV}

    tipoA tipoAutomovil;
    int numeroPuertas;
    int cantidadAsientos;
    int velocidadMaxima;

    enum tipoColor {BLANCO, NEGRO, ROJO, NARANJA, AMARILLO, VERDE, AZUL, VIOLETA}

    tipoColor color;
    int velocidadActual = 0;
    boolean automovil_Automatico;
    int Multas;

    public Automovil(String marca, int modelo, int motor, tipoCom tipoCombustible, tipoA tipoAutomovil, int numeroPuertas, int cantidadAsientos, int velocidadMaxima, tipoColor color, boolean automovil_Automatico, int Multas) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.tipoCombustible = tipoCombustible;
        this.tipoAutomovil = tipoAutomovil;
        this.numeroPuertas = numeroPuertas;
        this.cantidadAsientos = cantidadAsientos;
        this.velocidadMaxima = velocidadMaxima;
        this.color = color;
        this.automovil_Automatico = automovil_Automatico;
        this.Multas = Multas;
    }

    String getMarca() {
        return marca;
    }

    int getModelo() {
        return modelo;

    }

    int getMotor() {
        return motor;
    }

    tipoCom getTipoCombustible() {
        return tipoCombustible;
    }

    tipoA getTipoAutomovil() {
        return tipoAutomovil;
    }

    int getNumeroPuertas() {
        return numeroPuertas;
    }

    int getCantidadAsientos() {
        return cantidadAsientos;
    }

    int getVelociadadMaxima() {
        return velocidadMaxima;
    }

    tipoColor getColor() {
        return color;
    }

    int getVelocidadActual() {
        return velocidadActual;
    }

    boolean getAutomovil_Automatico() {
        return automovil_Automatico;
    }

    int getMultas() {
        return Multas;
    }

    void setMarca(String marca) {
        this.marca = marca;
    }

    void setModelo(int modelo) {
        this.modelo = modelo;
    }

    void setMotor(int motor) {
        this.motor = motor;
    }

    void setTipoCombustible(tipoCom tipoCombustible) {
        this.tipoCombustible = tipoCombustible;
    }

    void setTipoAutomovil(tipoA tipoAutomovil) {
        this.tipoAutomovil = tipoAutomovil;
    }

    void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    void setCantidadAsientos(int cantidadAsientos) {
        this.cantidadAsientos = cantidadAsientos;
    }

    void setVelociadadMaxima(int velociadadMaxima) {
        this.velocidadMaxima = velociadadMaxima;
    }

    void setColor(tipoColor color) {
        this.color = color;
    }

    void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    void setAutomovil_Automatico(boolean automovil_Automatico) {
        this.automovil_Automatico = automovil_Automatico;
    }

    void setMultas(int Multas) {
        this.Multas = Multas;
    }

    void acelerar(int incrementoVelocidad) {
        if (velocidadActual + incrementoVelocidad < velocidadMaxima) {
            velocidadActual +=incrementoVelocidad;
            Multas++;
            System.out.println("Multas por exceso de velocidad");
        }
    }
    boolean tieneMultas() {
        return Multas > 0;
    }
    public int totalMultas() {
        int valorMultas = 100;
        return Multas*valorMultas;
    }
    void desacelerar(int decrementoVelocidad){
        if ((velocidadActual - decrementoVelocidad) > 0) {
            velocidadActual = velocidadActual - decrementoVelocidad;
        } else {
            System.out.println("No se puede decrementar a una velocidad negativa");
        }
    }

    void frenar() {
        velocidadActual = 0;
    }

    double calcularTiempoLlegada(int distancia) {
        return distancia/velocidadActual;
    }

    void imprimir() {
        System.out.println("Marca = " + marca);
        System.out.println("Modelo = " + modelo);
        System.out.println("Motor = " + motor);
        System.out.println("Tipo de combustible = " + tipoCombustible);
        System.out.println("Tipo de automóvil = " + tipoAutomovil);
        System.out.println("Numero de puertas =  "+ numeroPuertas);
        System.out.println("Cantidad de asientos = " + cantidadAsientos);
        System.out.println("Velocida máxima = " + velocidadMaxima);
        System.out.println("Color =  "+ color);
        System.out.println("¿Es automatico?: "+automovil_Automatico);
        
    }
}
