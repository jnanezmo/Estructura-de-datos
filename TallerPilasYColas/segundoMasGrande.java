package TallerPilasYColas;

import java.util.LinkedList;
import java.util.Queue;

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
