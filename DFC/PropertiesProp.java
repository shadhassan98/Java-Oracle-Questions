package DFC;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesProp {
    public static void main(String[] args) {
        try {
            Properties prop = new Properties ();
            FileInputStream fis = new FileInputStream("DFC/resources/Message.properties"); 
            prop.load(fis);
            System.out.println(prop.getProperty("welcome1"));
            System.out.println(prop.getProperty("welcome2", "Test"));//line n1
            System.out.println(prop.getProperty("welcome3"));
        }
        catch (Exception e){
            System.out.println(e);
        }
        
    }
}
