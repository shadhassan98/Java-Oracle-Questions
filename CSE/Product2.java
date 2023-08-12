package CSE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Product2 {
    int id; int price;
    public Product2 (int id, int price) {
        this.id = id;
        this.price = price;
    }
    public String toString() { return id + ":" + price; }
// }

// class ProductMain{
    public static void main(String[] args) { // Check below line, anything else will give error
        List<Product2> products = new ArrayList<>(Arrays.asList(new Product2(1, 10),  // Check here
                                                new Product2(2, 30), 
                                                new Product2(2, 30)));
        Product2 p = products.stream().
                    reduce(new Product2 (4, 0), (p1, p2) -> { 
                        p1.price+=p2.price; 
                        return new Product2 (p1.id, p1.price);}); 
        products.add(p); 
        products.stream().parallel()
                .reduce((p1, p2) -> p1.price > p2.price ? p1 : p2)
                .ifPresent(System.out::println);
    }
}
