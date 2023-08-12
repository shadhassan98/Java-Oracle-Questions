package CSE;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Emp {
    String fName;
    String lName;
    public Emp (String fn, String ln) {
        fName = fn;
        lName = ln;
    }
    public String getfName() { return fName; }
    public String getlName() { return lName; }
    public String toString() {
        return (this.getfName() +" "+ this.getlName());
    }
    
    public static void main(String[] args) {
        List<Emp> emp = Arrays.asList (
        new Emp ("John", "Smith"),
        new Emp ("Peter", "Sam"),
        new Emp ("Peter", "Douglas"),
        new Emp ("Thomas", "Wale"),
        new Emp ("Thomas", "Lincoln"));
        List<Emp> employeeList = emp.stream()
        .sorted (Comparator.comparing(Emp::getfName).reversed().thenComparing(Emp::getlName)) //line n1
        .collect(Collectors.toList());
        System.out.println(employeeList);
    }
}

    
