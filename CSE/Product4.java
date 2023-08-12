package CSE;

public class Product4 {
    public double applyDiscount(double price) {
        assert (price > 0); // line n1  --- nothing will happen because no -ea option was given, ans - 0.0
        return price * 0.50;
    }
    public static void main(String[] args) {
        Product4 p = new Product4();
        double newPrice = p.applyDiscount(Double.parseDouble(args[0]));
        System.out.println("Newn price: " + newPrice);
    }
}
