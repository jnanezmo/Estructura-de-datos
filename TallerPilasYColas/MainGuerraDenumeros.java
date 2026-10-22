package TallerPilasYColas;

import java.util.LinkedList;
import java.util.Queue;

public class MainGuerraDenumeros {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 8: Guerra de números ===");
        System.out.println("Entrada: [2, 8, 7, 5] -> " + guerraDeNumeros(new int[]{2, 8, 7, 5}) + " (Esperado: 2)");
        System.out.println("Entrada: [1, 3, 5, 9] -> " + guerraDeNumeros(new int[]{1, 3, 5, 9}) + " (Esperado: 18)");
    }

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
