package TallerPilasYColas;


import java.util.LinkedList;
import java.util.Queue;

public class MainVotos {
    public static void main(String[] args) {
        
        System.out.println(" upvotes = 13,  downvotes = 0   : " + contarVotos(13, 0) + " ");
        System.out.println(" upvotes = 2,   downvotes = 33  : " + contarVotos(2, 33) + " ");
        System.out.println(" upvotes = 132, downvotes = 132 : " + contarVotos(132, 132) + " ");
    }

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
    

