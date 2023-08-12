package CSE;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class BufferedreaderBrCopy {
    public static void main (String[] args) throws IOException {
        BufferedReader brCopy = null;
        try (BufferedReader br = new BufferedReader (new FileReader("DFC/employee.txt"))) { // line n1 
            br.lines().forEach(c -> System.out.println(c)); 
            brCopy = br; //line n2
        }
        brCopy.ready(); //line n3;
    }
}
