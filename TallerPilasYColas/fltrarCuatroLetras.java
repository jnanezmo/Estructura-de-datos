package TallerPilasYColas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

// Devolver cadenas de cuatro letras (Cola de filtrado)

//Enunciado. De una lista de palabras, retornar solo aquellas cuya longitud sea exactamente 4. Modela el proceso encolando todas y desencolando para filtrar.

//Entrada: [“Tomate”, “Papa”, “Par”] Salida esperada: [“Papa”]
//Entrada: [“Luz”, “Casa”, “Sol”, “Lago”] Salida esperada: [“Casa”, “Lago”]
//Entrada: [“Azul”, “Rojo”, “Verde”] Salida esperada: [“Azul”, “Rojo”]

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
