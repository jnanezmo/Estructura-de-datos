package Estudiantes;

public class Estudiantes {

    //Metodo que permite llenar la matriz
    
    private String Codigo;
    private String Nombre;
    private double Promedio;

    //Constructor 

    public Estudiantes(String codigo, String nombre, double promedio){
        this.Codigo = codigo;
        this.Nombre = nombre;
        this.Promedio = promedio;
    }

    //Metos get para acceder a los datos 

    public String getCodigo(){
      return Codigo;
    }
    public String getNombre(){
        return Nombre;
    }
    public double getPromedio(){
        return Promedio;
    }
    
}
