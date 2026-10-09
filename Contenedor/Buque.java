package Contenedor;

public class Buque {
    // Atributos
    private String nombre;
    private String puertoOrigen;
    private int posicion;

    // Constructor
    public Buque(String nombre, String puertoOrigen, int posicion) {
        this.nombre = nombre;
        this.puertoOrigen = puertoOrigen;
        this.posicion = posicion;
    }

    // Métodos get
    public String getNombre() {
        return nombre;
    }

    public String getPuertoOrigen() {
        return puertoOrigen;
    }

    public int getPosicion() {
        return posicion;
    }

    // Método toString
    @Override
    public String toString() {
        return "Buque{nombre=" + nombre + ", origen=" + puertoOrigen + ", posicion=" + posicion + "}";
    }
}

