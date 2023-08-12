package DFC;

import java.io.IOException;

class Folder implements AutoCloseable { //line n1
//line n2
    public void close() throws IOException { 
        System.out.print("Close "); 
    }

    public void open () {
        System.out.print("Open ");
    }
}

public class FolderMain {
    public static void main (String [] args) throws Exception { 
        try (Folder f = new Folder()) { 
            f.open();
        }
    }
}

