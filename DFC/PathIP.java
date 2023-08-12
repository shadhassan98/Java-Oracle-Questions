package DFC;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathIP {
    public static void main(String[] args) {
        Path iP = Paths.get("/", "First.txt");
        //Path iP2 = Paths.toPath("/First.txt");
        //Path iP3 = new Path("/First.txt");

        System.out.println(iP);
    }
}
