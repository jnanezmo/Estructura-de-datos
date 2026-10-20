package TallerPilasColas;

import java.util.ArrayDeque;
import java.util.Deque;

public class PanSimilar {
    public static void main(String[] args) {
        Deque<String> s1 = new ArrayDeque<>();
        Deque<String> s2 = new ArrayDeque<>();
        Deque<String> s3 = new ArrayDeque<>();
        Deque<String> s4 = new ArrayDeque<>();

        s1.addLast("pan blanco");
        s1.addLast("lechuga");
        s1.addLast("pan blanco");

        s2.addLast("pan blanco");
        s2.addLast("tomate");
        s2.addLast("pan blanco");
        Sandwich.verificarPan(s1);

        s3.addLast("pan integral");
        s3.addLast("queso");
        s3.addLast("pan integral");

        s4.addLast("pan blanco");
        s4.addLast("queso");
        s4.addLast("pan integral");
        Sandwich.verificarPan(s3);

    }
}

       
        

        
        
        
       
    

