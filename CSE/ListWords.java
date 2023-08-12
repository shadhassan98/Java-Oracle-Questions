package CSE;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ListWords {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("win","try","best","luck","do");
        Predicate<String> test1 = w-> {
            System.out.println("Checking...");
            return w.equals("do");
        };
        Predicate test2 = (String w) -> w.length() > 3; //line n2
        //long cnt = 
        words.stream()
                        .filter(test2)
                        .filter(test1)
                        .count();
        //System.out.println(cnt);
    }
    
}
