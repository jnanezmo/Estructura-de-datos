package TallerPilasYColas;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.List;

public class MainPanSimilar {
    public static void main(String[] args) {
        
        List<String> s1 = Arrays.asList("pan blanco", "lechuga", "pan blanco");
        List<String> s2 = Arrays.asList("pan blanco", "tomate", "pan blanco");
        System.out.println("[pan blanco, lechuga, pan blanco], S2 = [pan blanco, tomate, pan blanco]: " + panSimilar(s1, s2) + "");

        List<String> s3 = Arrays.asList("pan integral", "queso", "pan integral");
        List<String> s4 = Arrays.asList("pan blanco", "queso", "pan integral");
        System.out.println("[pan integral, queso, pan integral], S2 = [pan blanco, queso, pan integral]: " + panSimilar(s3, s4) + "");
    }

    public static boolean panSimilar(List<String> s1, List<String> s2) {
        if (s1 == null || s2 == null || s1.isEmpty() || s2.isEmpty()) return false;
        Deque<String> d1 = new ArrayDeque<>(s1);
        Deque<String> d2 = new ArrayDeque<>(s2);

        return d1.peekFirst().equals(d2.peekFirst()) && d1.peekLast().equals(d2.peekLast());
    }
}
