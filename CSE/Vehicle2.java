package CSE;
import java.util.Set;
import java.util.TreeSet;

public class Vehicle2 {
    int vno;
    String name;
    public Vehicle2 (int vno, String name) {
        this.vno = vno;
        this.name = name;
    }
    public String toString () {
        return vno + ":" + name;
    }
    public static void main(String[] args) {
        Set<Vehicle2> vehicles = new TreeSet <> ();
        vehicles.add(new Vehicle2 (10123, "Ford"));
        vehicles.add(new Vehicle2 (10124, "BMW"));
        System.out.println(vehicles);
    }
}
