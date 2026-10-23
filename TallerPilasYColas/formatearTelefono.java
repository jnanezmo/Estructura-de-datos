package TallerPilasYColas;

import java.util.LinkedList;
import java.util.Queue;
// Formateo de numero telefonico (Cola)

//Enunciado. Dado un arreglo de 10 digitos, construir la cadena con formato (ddd) ddd-dddd consumiendo los digitos en orden FIFO desde una cola. Validar que se entreguen exactamente 10 digitos.

//Entrada: [1,2,3,4,5,6,7,8,9,0]
//Entrada: [3,1,9,2,4,0,6,1,2,9]
//Salida esperada: (123) 456-7890
//Salida esperada: (300) 123-4567

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
