package TallerPilasYColas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class fltrarCuatroLetras {
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
