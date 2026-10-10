package Tallersemana6;

public class Estudiante {
    
    private String codigo;
    private String nombre;
    private String programa;
    private double promedio;

    // Constructor
    public Estudiante(String codigo, String nombre, String programa, double promedio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.programa = programa;
        this.promedio = promedio;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public String getPrograma() { return programa; }
    public double getPromedio() { return promedio; }

    @Override
    public String toString() {
        return "Código: " + codigo + " | Nombre: " + nombre + " | Programa: " + programa + " | Promedio: " + promedio;
    }
}
