package DFC;
import java.io.File;
import java.io.IOException;

public class RecDelete {

    public void recDelete (String dirName) throws IOException {
        File[] listOfFiles = new File (dirName).listFiles();
        if(listOfFiles != null && listOfFiles.length > 0) {
            for(File aFile:listOfFiles) {
                if(aFile.isDirectory()) {
                    recDelete(aFile.getAbsolutePath());
                }
                else {
                    if(aFile.getName().endsWith(".class")){
                        aFile.delete();
                        System.out.println(aFile.getName() + " was deleted.");
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        String dirName = "DFC";
        RecDelete fDelete = new RecDelete();
        try {
            fDelete.recDelete(dirName);
        } 
        catch (IOException e) {
            System.out.println(e);
        }
    }
    
}
