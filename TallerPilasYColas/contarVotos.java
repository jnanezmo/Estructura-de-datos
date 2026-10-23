package TallerPilasYColas;


import java.util.LinkedList;
import java.util.Queue;

//  Votos a favor vs. en contra (Cola)

//Dados dos contadores: upvotes y downvotes, modela cada voto en una cola como +1 (a favor) o-1 (en contra). Procesa la cola sumando todos los valores hasta vaciarla. Retorna ladiferencia: (a favor) − (en contra).

//Entrada: upvotes = 13, downvotes = 0 Salida esperada: 13
//Entrada: upvotes = 2, downvotes = 33 Salida esperada:-31
//Entrada: upvotes = 132, downvotes = 132 Salida esperada: 0


public class contarVotos {
    //  Votos a favor vs. en contra (Cola)
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
