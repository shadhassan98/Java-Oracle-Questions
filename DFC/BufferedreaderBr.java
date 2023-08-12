package DFC;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedreaderBr {
    public static void main (String [ ] args) throws IOException {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.print ("Enter GDP: ");
        int GDP = Integer.parseInt(br.readLine());
        System.out.println("GDP = " + GDP);
        //line 1
        }
}
