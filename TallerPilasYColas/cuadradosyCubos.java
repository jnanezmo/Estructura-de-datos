package TallerPilasYColas;

import java.util.Stack;

// Cuadrados y cubos (Pila)

// Enunciado. Dado un par de enteros [a,b], evaluar si √a es igual a 3√b (con tolerancia numericarazonable). Modela el flujo usando una pila donde primero apilas ambos y luego desapilas paracalcular.

// Entrada: a = 4, b = 8 Salida esperada: true
// Entrada: a = 16, b = 48 Salida esperada: false
// Entrada: a = 9, b = 27 Salida esperada: true

public class cuadradosyCubos {
    public static boolean cuadradosYCubos(int a, int b) {
        Stack<Integer> pila = new Stack<>();
        pila.push(b);
        pila.push(a);

        int valA = pila.pop();
        int valB = pila.pop();

        double raizA = Math.sqrt(valA);
        double raiz3B = Math.cbrt(valB);

        return (raizA == Math.floor(raizA)) && (raiz3B == Math.floor(raiz3B));
    }


}
