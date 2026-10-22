package TallerPilasYColas;

import java.util.LinkedList;
import java.util.Queue;

public class guerraDeNumeros {
    public static int guerraDeNumeros(int[] numeros) {
        Queue<Integer> cola = new LinkedList<>();
        for (int n : numeros) cola.offer(n);

        int sumaPares = 0;
        int sumaImpares = 0;

        while (!cola.isEmpty()) {
            int num = cola.poll();
            if (num % 2 == 0) {
                sumaPares += num;
            } else {
                sumaImpares += num;
            }
        }
        return Math.abs(sumaImpares - sumaPares);
    }
}
    

