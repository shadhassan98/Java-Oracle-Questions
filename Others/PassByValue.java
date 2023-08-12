package Others;
public class PassByValue {
    public static void main(String[] args) {
        Integer x = 10;
        System.out.println("Before method call: " + x);
        modifyPrimitive(x);
        System.out.println("After method call: " + x);
    }

    public static void modifyPrimitive(Integer value) {
        value = 20;
    }
}

