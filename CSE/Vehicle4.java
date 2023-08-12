package CSE;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Vehicle4 {
    int vId;
    String vName;
    public Vehicle4 (int vIdArg, String vNameArg) {
        this.vId=vIdArg;
        this.vName = vNameArg;
    }
    
    public int getVId() { return vId; }
    public String getVName () { return vName; } 
    public String toString() {
        return vName;
    }
}
class VehicleMain4 {
    public static void main(String[] args) {
        List<Vehicle4> vehicle = Arrays.asList(new Vehicle4 (2, "Car"), 
                                new Vehicle4 (3, "Bike"), 
                                new Vehicle4 (1, "Truck"));
    
        vehicle.stream()
                
                //.sorted ((v1, v2) -> v1.getVId() < v2.getVId())
                 //.sorted (Comparable.comparing(Vehicle::getVName)).reversed ()
                 //.map (v -> v.getVid()) .sorted ()
                 //.sorted((v1, v2) -> Integer.compare(v1.getVId(), v2.getVId())) // -- correct
                 .sorted(Comparator.comparing((Vehicle4 v) -> v.getVId()))  //-- correct
                .forEach (System.out::print);
    }
    
}
