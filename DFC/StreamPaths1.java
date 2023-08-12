package DFC;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamPaths1 {
    public static void main(String[] args) {
        Stream<Path> paths = Stream.of (Paths. get("DFC/data.doc"),
        Paths. get("DFC/data.txt"),
        Paths. get("DFC/data.xml"));
        paths.filter(s-> s.toString().contains("data")).forEach(
        s -> {
        try {
        Files.readAllLines(s)
        .stream()
        .forEach(System.out::println); //line n1
        } catch (IOException e) {
        System.out.println(e);
        }
}
);
    }
}
