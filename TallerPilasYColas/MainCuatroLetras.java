package TallerPilasYColas;


import java.util.*;

public class MainCuatroLetras {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 7: Cadenas de cuatro letras ===");
        System.out.println("Entrada: [Tomate, Papa, Par] -> " + filtrarCuatroLetras(Arrays.asList("Tomate", "Papa", "Par")));
        System.out.println("Entrada: [Luz, Casa, Sol, Lago] -> " + filtrarCuatroLetras(Arrays.asList("Luz", "Casa", "Sol", "Lago")));
    }

    public static List<String> filtrarCuatroLetras(List<String> palabras) {
        Queue<String> cola = new LinkedList<>(palabras);
        List<String> resultado = new ArrayList<>();

        while (!cola.isEmpty()) {
            String palabra = cola.poll();
            if (palabra != null && palabra.length() == 4) {
                resultado.add(palabra);
            }
        }
        return resultado;
    }
}