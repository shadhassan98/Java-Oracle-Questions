package CSE;
import java.io.Console;

public class Console1 {
    public static void main(String[] args) {
        Console console = System.console();
        char[] pass = console.readPassword("Enter Password :");
        String password = new String(pass);
        System.out.println(password);
    }
}
