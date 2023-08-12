package JDBCLocale;

import java.util.Locale;
import java.util.ResourceBundle;

public class ResourceBundleExample {
    public static void main(String[] args) {
        // Specify the desired locale
        Locale currentLocale = new Locale("fr", "FR"); // French, France

        // Load the appropriate resource bundle based on the locale
        ResourceBundle messages = ResourceBundle.getBundle("JDBCLocale.messages", currentLocale);

        // Access localized messages using keys
        String greeting = messages.getString("greeting");
        String farewell = messages.getString("farewell");

        System.out.println(greeting); // Output: Bonjour
        System.out.println(farewell); // Output: Au revoir
    }
}
