package CSE;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class ListLi {
    public static void main(String[] args) {
        List<String> li = Arrays.asList("Java","J2EE","J2ME","JSTL","JSP","Oracle DB");
        Predicate<String> val = p -> p.contains("J");
        List<String> neLi = li.stream().filter(x -> x.length() >3)
                                        .filter(val).collect(Collectors.toList());
        System.out.println(neLi);
    }
}
