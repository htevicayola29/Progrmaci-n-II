package Preferencias;
import Utilidades.InputHelper;

public class Preferencia {
    private String tamaño; // Tamaño del vaso: Pequeño, Mediano, Grande
    private String tipoLeche; // Tipo de leche (o sin leche)
    private int temperatura; // Temperatura en grados
    private String intensidad; // Suave, Medio, Fuerte
    private double precioAdicional; // Aumento de precio por preferencias

    // Constructor vacío
    public Preferencia() {
        this.precioAdicional = 0.0;  // Inicialmente no hay incremento
    }

    // Métodos para obtener las preferencias del usuario
    public void seleccionarTamaño() {
        System.out.println("Seleccione el tamaño del vaso:");
        System.out.println("1. Pequeño");
        System.out.println("2. Mediano");
        System.out.println("3. Grande");

        int opcion = InputHelper.leerEntero("Ingrese su elección (1-3):", 1, 3);
        switch (opcion) {
            case 1 -> tamaño = "Pequeño";
            case 2 -> tamaño = "Mediano";
            case 3 -> tamaño = "Grande";
        }
    }

    public void seleccionarTipoLeche(boolean llevaLeche) {
        if (!llevaLeche) {
            tipoLeche = "Sin leche";
            System.out.println("Esta bebida no lleva leche.");
            return;
        }

        System.out.println("Seleccione el tipo de leche:");
        System.out.println("1. Entera");
        System.out.println("2. Semidesnatada");
        System.out.println("3. Desnatada");
        System.out.println("4. Leche de soja");
        System.out.println("5. Leche de almendras");
        System.out.println("6. Leche de avena");
        System.out.println("7. Sin leche");

        int opcion = InputHelper.leerEntero("Ingrese su elección (1-7):", 1, 7);
        switch (opcion) {
            case 1 -> tipoLeche = "Entera";
            case 2 -> tipoLeche = "Semidesnatada";
            case 3 -> tipoLeche = "Desnatada";
            case 4 -> tipoLeche = "Leche de soja";
            precioAdicional += 0.50;
            break;
            case 5 -> tipoLeche = "Leche de almendras";
            precioAdicional += 0.50;
            break;
            case 6 -> tipoLeche = "Leche de avena";
            precioAdicional += 0.50;
            break;
            case 7 -> tipoLeche = "Sin leche";
            break;
        }
    }

    public void seleccionarTemperatura(boolean esCaliente) {
        if (esCaliente) {
            System.out.println("Seleccione la temperatura de la bebida caliente (°C):");
            System.out.println("1. 60°C (Tibio)");
            System.out.println("2. 70°C (Caliente)");
            System.out.println("3. 80°C (Muy caliente)");

            int opcion = InputHelper.leerEntero("Ingrese su elección (1-3):", 1, 3);
            switch (opcion) {
                case 1 -> temperatura = 60;
                case 2 -> temperatura = 70;
                case 3 -> temperatura = 80;
            }
            precioAdicional += 0.50;  // Incremento por ser bebida caliente
        } else {
            System.out.println("Seleccione la temperatura de la bebida fría (°C):");
            System.out.println("1. 0°C (Muy frío)");
            System.out.println("2. 4°C (Frío estándar)");
            System.out.println("3. 8°C (Frío ligero)");

            int opcion = InputHelper.leerEntero("Ingrese su elección (1-3):", 1, 3);
            switch (opcion) {
                case 1 -> temperatura = 0;
                case 2 -> temperatura = 4;
                case 3 -> temperatura = 8;
            }
        }
    }

    public void seleccionarIntensidad(String tipoBebida) {
        System.out.println("Seleccione la intensidad del " + tipoBebida + ":");
        System.out.println("1. Suave");
        System.out.println("2. Medio");
        System.out.println("3. Fuerte");

        int opcion = InputHelper.leerEntero("Ingrese su elección (1-3):", 1, 3);
        switch (opcion) {
            case 1 -> intensidad = "Suave";
            case 2 -> intensidad = "Medio";
            case 3 -> intensidad = "Fuerte";
        }
    }

    // Métodos Getters
    public String getTamaño() {
        return tamaño;
    }

    public String getTipoLeche() {
        return tipoLeche;
    }

    public int getTemperatura() {
        return temperatura;
    }

    public String getIntensidad() {
        return intensidad;
    }

    public double getPrecioAdicional() {
        return precioAdicional;
    }

    @Override
    public String toString() {
        return "Preferencias seleccionadas:\n" +
                "Tamaño: " + tamaño + "\n" +
                "Tipo de leche: " + tipoLeche + "\n" +
                "Temperatura: " + temperatura + "°C\n" +
                "Intensidad: " + intensidad + "\n" +
                "Precio adicional: $" + precioAdicional;
    }
}
