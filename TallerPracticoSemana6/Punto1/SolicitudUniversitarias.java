package TallerPracticoSemana6.Punto1;

import java.util.*;
public class SolicitudUniversitarias {

public static void main(String[] args) {
        Queue<Solicitud> cola = new LinkedList<>();

        System.out.println(" COLA VACIA ");
        Solicitud.mostrar(cola);
        Solicitud.atender(cola);
        Solicitud.siguiente(cola);

        System.out.println(" REGISTRAR ");
        Solicitud.registrar(cola, new Solicitud(1, "Pedro", "Certificado de notas"));
        Solicitud.registrar(cola, new Solicitud(2, "Juan", "Cancelacion de materia"));
        Solicitud.registrar(cola, new Solicitud(3, "Maria", "Carnet estudiantil"));
        Solicitud.mostrar(cola);

        System.out.println(" SIGUIENTE ");
        System.out.println("Siguiente por atender: " + Solicitud.siguiente(cola));

        System.out.println(" PRINCIPIO FIFO ");
        // La primera en llegar (1) es la primera en ser atendida
        System.out.println("Atendida: " + Solicitud.atender(cola));
        System.out.println("Atendida: " + Solicitud.atender(cola));
        Solicitud.mostrar(cola);

        System.out.println(" COLA LLENA ");
        for (int i = 4; i <= 13; i++) {
            Solicitud.registrar(cola, new Solicitud(i, "Estudiante " + i, "Paz y salvo"));
        }
        Solicitud.mostrar(cola);
    }
 
}
