package TallerPilasYColas;

import java.util.LinkedList;
import java.util.Queue;

public class MainFormataTelefono {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 4: Formateo de número telefónico (Cola) ===");
        System.out.println("Entrada: [1,2,3,4,5,6,7,8,9,0] -> " + formatearTelefono(new int[]{1,2,3,4,5,6,7,8,9,0}));
        System.out.println("Entrada: [3,0,0,1,2,3,4,5,6,7] -> " + formatearTelefono(new int[]{3,0,0,1,2,3,4,5,6,7}));
    }

    public static String formatearTelefono(int[] digitos) {
        if (digitos == null || digitos.length != 10) {
            throw new IllegalArgumentException("Se requieren exactamente 10 dígitos.");
        }
        Queue<Integer> cola = new LinkedList<>();
        for (int d : digitos) cola.offer(d);

        StringBuilder sb = new StringBuilder("(");
        for (int i = 0; i < 3; i++) sb.append(cola.poll());
        sb.append(") ");
        for (int i = 0; i < 3; i++) sb.append(cola.poll());
        sb.append("-");
        for (int i = 0; i < 4; i++) sb.append(cola.poll());

        return sb.toString();
    }
}
