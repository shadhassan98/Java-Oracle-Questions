package CSE;

import java.util.Arrays;
import java.util.List;

public class ListCodes2 {
    public static void main(String[] args) {
        List<String> codes = Arrays.asList ("DOC", "MPEG", "JPEG"); 
        codes.forEach (c -> System.out.print(c + " "));
        String fmt = codes.stream()
                            .filter (s-> s.contains ("PEG"))
                            .reduce((s, t) -> s + t)
                            .get();
        System.out.println("\n" + fmt);
    }
}
