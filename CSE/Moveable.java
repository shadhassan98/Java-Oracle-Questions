package CSE;
public interface Moveable <Integer> {
    public default void walk (Integer distance) {
        System.out.println("Walking " + distance);
     }
      public void run(Integer distance);
}
