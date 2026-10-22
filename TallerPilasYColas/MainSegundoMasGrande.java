package TallerPilasYColas;

import java.util.LinkedList;
import java.util.Queue;

public class MainSegundoMasGrande {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 5: Segundo número más grande ===");
        System.out.println("Entrada: [10, 40, 30, 20, 50] -> " + segundoMasGrande(new int[]{10, 40, 30, 20, 50}) + " (Esperado: 40)");
        System.out.println("Entrada: [-3, -1, -7, -2] -> " + segundoMasGrande(new int[]{-3, -1, -7, -2}) + " (Esperado: -2)");
    }

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
