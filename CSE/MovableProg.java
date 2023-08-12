package CSE;
public class MovableProg {
    public static void main(String[] args) {
        Moveable<Integer> animal = n -> System.out.println("Running " + n); 
            animal.run(100); 
            animal.walk(20);
    }
}
