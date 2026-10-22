package TallerPilasYColas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class sociedadSecreta {
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
