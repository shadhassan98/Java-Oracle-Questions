package DFC;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathSource2 {
    public static void main(String[] args) {
        Path source = Paths.get("DFC/green.txt");
        Path target = Paths.get("DFC/colors/yellow.txt");
        try {
            Files.move(source, target, StandardCopyOption.ATOMIC_MOVE);
            Files.delete(source);
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}
