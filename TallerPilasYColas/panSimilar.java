package TallerPilasYColas;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class panSimilar {
    public static boolean booleanpanSimilar(List<String> s1, List<String> s2) {
        if (s1 == null || s2 == null || s1.isEmpty() || s2.isEmpty()) return false;
        Deque<String> d1 = new ArrayDeque<>(s1);
        Deque<String> d2 = new ArrayDeque<>(s2);

        return d1.peekFirst().equals(d2.peekFirst()) && d1.peekLast().equals(d2.peekLast());
    }
    
}
