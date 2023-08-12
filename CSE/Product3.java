package CSE;

public class Product3 {
    String pname;
    public Product3(String pname) {
        this.pname =pname;
    }
}

class Product3Main {
    public static void main(String[] args) {
        Product3 p1 = new Product3("PowerCharger");
        Product3 p2 = p1;
        System.out.println(p1.equals(p2));
        Product3 p3 = new Product3("PowerCharger");
        System.out.println(p1.equals(p3));
    }
}