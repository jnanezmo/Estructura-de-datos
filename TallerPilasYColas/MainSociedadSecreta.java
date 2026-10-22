package TallerPilasYColas;

import java.util.*;

public class MainSociedadSecreta {
    public static void main(String[] args) {
        System.out.println("=== Ejercicio 6: Sociedad secreta ===");
        System.out.println("Entrada: [Adam, Sarah, Malcolm] -> " + sociedadSecreta(Arrays.asList("Adam", "Sarah", "Malcolm")) + " (Esperado: AMS)");
        System.out.println("Entrada: [bruce, clark, diana] -> " + sociedadSecreta(Arrays.asList("bruce", "clark", "diana")) + " (Esperado: BCD)");
        System.out.println("Entrada: [Zoe, anna, leo] -> " + sociedadSecreta(Arrays.asList("Zoe", "anna", "leo")) + " (Esperado: ALZ)");
    }

    public static String sociedadSecreta(List<String> nombres) {
        Queue<String> cola = new LinkedList<>(nombres);
        List<Character> letras = new ArrayList<>();

        while (!cola.isEmpty()) {
            String nombre = cola.poll();
            if (nombre != null && !nombre.isEmpty()) {
                letras.add(Character.toUpperCase(nombre.charAt(0)));
            }
        }
        Collections.sort(letras);
        StringBuilder sb = new StringBuilder();
        for (char c : letras) {
            sb.append(c);
        }
        return sb.toString();
    }
}
