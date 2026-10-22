package TallerPilasColas;

import java.util.LinkedList;
import java.util.Queue;

public class VotosFavorEncontra {

    public static int calcularDiferencia(int upvotes, int downvotes) {
         
        //Creo la cola para almacenar los votos
        Queue<Integer> cola = new LinkedList<>();

        // Agregar votos positivos
        for (int i = 0; i < upvotes; i++) {
            cola.offer(1);
        }

        // Agregar votos negativos
        for (int i = 0; i < downvotes; i++) {
            cola.offer(-1);
        }

        int resultado = 0;

        // Procesar la cola
        while (!cola.isEmpty()) {
            resultado += cola.poll();
        }

        return resultado;
    }
}