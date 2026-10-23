package TallerPilasYColas;

import java.util.LinkedList;
import java.util.Queue;

//Guerra de numeros (Cola)
//Enunciado. Dado un conjunto de enteros, sumar por separado pares e impares mientras se vandesencolando. Retornar la diferencia absoluta entre la suma de impares y la suma de pares.

//Entrada: [2, 8, 7, 5] Salida esperada: 2 (Impares: 7+5=12, Pares: 2+8=10, Diferencia =|12-10| = 2)
//Entrada: [1, 3, 5, 9] Salida esperada: 18 (Impares: 18, Pares: 0)
//Entrada: [2, 4, 6, 8] Salida esperada: 20 (Impares: 0, Pares: 20)

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
    

