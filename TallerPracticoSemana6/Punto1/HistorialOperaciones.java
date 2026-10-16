package TallerPracticoSemana6.Punto1;

import java.util.Stack;

public class HistorialOperaciones {
    public static void main(String[] args) {
        Stack<Operacion> historial = new Stack<>();

        System.out.println(" PILA VACIA ");
        Operacion.mostrar(historial);
        Operacion.desapilar(historial);
        Operacion.tope(historial);

        System.out.println(" APILAR ");
        Operacion.apilar(historial, new Operacion(1, "Crear archivo", "Creacion"));
        Operacion.apilar(historial, new Operacion(2, "Escribir texto", "Edicion"));
        Operacion.apilar(historial, new Operacion(3, "Borrar parrafo", "Eliminacion"));
        Operacion.mostrar(historial);

        System.out.println(" TOPE ");
        System.out.println("Tope: " + Operacion.tope(historial));

        System.out.println(" PRINCIPIO LIFO ");
        // La ultima en entrar (3) es la primera en salir
        System.out.println("Desapilada: " + Operacion.desapilar(historial));
        System.out.println("Desapilada: " + Operacion.desapilar(historial));
        Operacion.mostrar(historial);

        System.out.println(" PILA LLENA ");
        for (int i = 4; i <= 13; i++) {
            Operacion.apilar(historial, new Operacion(i, "Operacion " + i, "Edicion"));
        }
        Operacion.mostrar(historial);
    }
}