package CSE;

import java.util.Arrays;
import java.util.List;

public class ListValList {
    public static void main(String[] args) {
        List<String> valList = Arrays.asList("","George","","John","Jim");
        Long newVal = valList.stream()                   //line n1
                             .filter(x -> !x.isEmpty())
                             .count();                   //line n2
        System.out.println(newVal);

    }
}
