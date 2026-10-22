package TallerPilasYColas;


import java.util.LinkedList;
import java.util.Queue;

public class MainVotos {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 1: Votos a favor vs. en contra ===");
        System.out.println("Entrada: upvotes=13, downvotes=0 -> Resultado: " + contarVotos(13, 0) + " (Esperado: 13)");
        System.out.println("Entrada: upvotes=2, downvotes=33 -> Resultado: " + contarVotos(2, 33) + " (Esperado: -31)");
        System.out.println("Entrada: upvotes=132, downvotes=132 -> Resultado: " + contarVotos(132, 132) + " (Esperado: 0)");
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
    

