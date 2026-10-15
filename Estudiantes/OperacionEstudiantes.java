package Estudiantes;

public class OperacionEstudiantes {

    //Metodo para cfrear y llenar el areglo de 10 estudiantes
    public Estudiantes[] llenarEstudiantes(){
        Estudiantes[] lista = new Estudiantes[10];
        String[] Codigos = {"A001", "A002", "A003", "A004", "A006", "A007", "A008", "A009", "A009", "A010"};
        String [] Nombres = {"Jeison", "Andrea", "Natalia", "Jesus", "Cristian", "Mariana", "Valeria", "Daniel", "Marlon", "Lizeth"};
        for (int i = 0; i < lista.length; i++){
            double promedio = Math.round((Math.random() * 5.0) *10.0) / 10.0;
            lista[i] = new Estudiantes(Codigos[i], Nombres[i], promedio);
        }
        return lista;
    }


    
    
}
