package TallerPilasYColas;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

//Pan similar (Deque como cola de doble extremo)

// Representa un sandwich como una secuencia: pan– relleno– pan. Dados dos sandwiches, verificar si usan el mismo pan al inicio y al final.
// Entrada: S1 = [“pan blanco”, “lechuga”, “pan blanco”], S2 = [“pan blanco”, “tomate”, “pan blanco”]

// Salida esperada: true
// Entrada: S1 = [“pan integral”, “queso”, “pan integral”], S2 = [“pan blanco”, “queso”, “pan integral”]
//Salida esperada: false

public class panSimilar {
    public static boolean booleanpanSimilar(List<String> s1, List<String> s2) {
        if (s1 == null || s2 == null || s1.isEmpty() || s2.isEmpty()) return false;
        Deque<String> d1 = new ArrayDeque<>(s1);
        Deque<String> d2 = new ArrayDeque<>(s2);

        return d1.peekFirst().equals(d2.peekFirst()) && d1.peekLast().equals(d2.peekLast());
    }
    
}
