package TallerPilasYColas;

import java.util.Stack;

public class MainCuadradosYcubos {
    public static void main(String[] args) {
        
        System.out.println("a = 4,  b = 8 " + cuadradosYCubos(4, 8)    + " ");
        System.out.println("a = 16, b = 48 " + cuadradosYCubos(16, 48) + " ");
        System.out.println("a = 9,  b = 27 " + cuadradosYCubos(9, 27)  + " ");
    }

    public static boolean cuadradosYCubos(int a, int b) {
        Stack<Integer> pila = new Stack<>();
        pila.push(b);
        pila.push(a);

        int valA = pila.pop();
        int valB = pila.pop();

        double raizA = Math.sqrt(valA);
        double raiz3B = Math.cbrt(valB);

        return Math.abs(raizA - raiz3B) < 1e-9;
    }
}
