package CSE;

import java.util.function.DoubleSupplier;

public class Job2 {
    String name;
    Integer cost;
    Job2(String name, Integer cost) {
        this.name = name;
        this.cost = cost;
    }
    String getName() { return name; }
    int getCost() { return cost; }
    public static void main(String[] args) {
        Job2 j1 = new Job2("IT",null);
        DoubleSupplier js1 = j1::getCost;
        System.out.println(j1.getName() + ":" + js1.getAsDouble());
    }
}
