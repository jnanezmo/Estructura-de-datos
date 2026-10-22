package TallerPilasYColas;

import java.util.Stack;

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
