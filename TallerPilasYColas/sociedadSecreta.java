package TallerPilasYColas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

//Sociedad secreta (Cola + ordenamiento)

//Enunciado. Dada una lista de nombres, desencolar cada nombre, tomar su primera letra en mayusculas, ordenar alfabeticamente dichas letras y concatenarlas para formar el nombre de la sociedad.

//Entrada: [“Adam”, “Sarah”, “Malcolm”] Salida esperada: AMS
//Entrada: [“bruce”, “clark”, “diana”] Salida esperada: BCD
//Entrada: [“Zoe”, “anna”, “leo”] Salida esperada: ALZ


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
