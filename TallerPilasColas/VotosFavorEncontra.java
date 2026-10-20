package TallerPilasColas;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class VotosFavorEncontra {

    public int calcularDiferencia(int upvotes, int downvotes) {
        // Crear una cola para almacenar los votos
        Queue<Integer> colaVotos = new LinkedList<>();

        // Agregar los votos a favor (+1) a la cola
        for (int i = 0; i < upvotes; i++) {
            colaVotos.add(1);
        }

        // Agregar los votos en contra (-1) a la cola
        for (int i = 0; i < downvotes; i++) {
            colaVotos.add(-1);
        }

        // Procesar la cola sumando todos los valores hasta vaciarla
        int suma = 0;
        while (!((Collection<Integer>) colaVotos).isEmpty()) {
            suma += colaVotos.poll();
        }

        return suma;
    }

}

