package Contenedor;

public class Contenedor {
    // Atributos
    private String id;
    private double peso;
    private String origen;

    // Constructor
    public Contenedor(String id, double peso, String origen) {
        this.id = id;
        this.peso = peso;
        this.origen = origen;
    }

    // Métodos get
    public String getId() {
        return id;
    }

    public double getPeso() {
        return peso;
    }

    public String getOrigen() {
        return origen;
    }

    // Método toString
    @Override
    public String toString() {
        return "Contenedor{id=" + id + ", peso=" + peso + ", origen=" + origen + "}";
    }
}

    
