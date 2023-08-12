package CSE;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamIstr {

    public static void main(String[] args) {
        Stream<List<String>> iStr= Stream.of (
        Arrays.asList ("1", "John"),
        Arrays.asList ("2", null));
        Stream<String> nInSt = iStr.flatMapToInt((x) -> x.stream());
        nInSt.forEach(System.out::print);
    }
    
}
