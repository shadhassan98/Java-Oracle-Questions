package DFC;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main1 {
public static void main(String[] args) {
try {
Path path = Paths.get("/u01/work/filestore.txt"); 
boolean result = Files.deleteIfExists (path);

if (result) System.out.println (path + "is deleted."); 
else System.out.println(path + "is not deleted.");
} catch (IOException e) {
}
System.out.println("Exception");
}
}