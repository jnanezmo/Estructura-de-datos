package TallerPilasYColas;

import java.util.LinkedList;
import java.util.Queue;

public class contarVotos {
    // 1. Votos a favor vs. en contra (Cola)
    public static int contarVotos(int upvotes, int downvotes) {
        Queue<Integer> cola = new LinkedList<>();
        for (int i = 0; i < upvotes; i++) cola.offer(1);
        for (int i = 0; i < downvotes; i++) cola.offer(-1);

        int diferencia = 0;
        while (!cola.isEmpty()) {
            diferencia += cola.poll();
        }
        return diferencia;
    }
    
}
