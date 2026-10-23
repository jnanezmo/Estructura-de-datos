package TallerPilasYColas;

import java.util.LinkedList;
import java.util.Queue;

//Segundo numero mas grande (Cola y/o Pila)

//Enunciado. Dado un arreglo de enteros (al menos dos), determinar el segundo mayor. Procesalos elementos usando inicialmente una cola (y si deseas, apoya el seguimiento con una pila) para mantener max1 y max2 durante el recorrido.

//Entrada: [10, 40, 30, 20, 50] Salida esperada: 40
//Entrada: [5, 5, 5, 5, 9] Salida esperada: 5
//Entrada: [-3,-1,-7,-2] Salida esperada:-2

public class segundoMasGrande {
    public static int segundoMasGrande(int[] numeros) {
        Queue<Integer> cola = new LinkedList<>();
        for (int n : numeros) cola.offer(n);

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        while (!cola.isEmpty()) {
            int actual = cola.poll();
            if (actual > max1) {
                max2 = max1;
                max1 = actual;
            } else if (actual > max2 && actual != max1) {
                max2 = actual;
            }
        }
        return max2;
    }
    
}
