package CSE;

import java.util.Arrays;
import java.util.List;

public class ListCS {
    public static void main(String[] args) {
        List<String> cs = Arrays.asList("Java","Java EE","Java ME");
        //line n1
        boolean b = cs.stream().allMatch(w -> w.equals("Java"));
        System.out.println(b);
    }
}
