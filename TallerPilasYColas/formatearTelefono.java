package TallerPilasYColas;

import java.util.LinkedList;
import java.util.Queue;

public class formatearTelefono {
    // 4. Formateo de número telefónico (Cola)
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
