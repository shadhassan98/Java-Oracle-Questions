package DFC;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathSource {
    public static void main(String[] args) {
        Path source = Paths.get("DFC/data/december/log.txt");
        Path destination = Paths.get("DFC/data/");
        try {
            Files.copy(source,destination);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
