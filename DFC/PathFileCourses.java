package DFC;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class PathFileCourses {

    public static void main(String[] args) {
        Path file = Paths.get("courses.txt");
        try{
            Stream<String> fc = Files.lines(file);
            fc.forEach((s) -> System.out.println(s));
            fc.close();
        }
        catch(IOException e) {
            System.out.println(e);
        }
        
    }
    
}
