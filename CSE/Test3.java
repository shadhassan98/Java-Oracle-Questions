package CSE;
import java.util.ArrayDeque;

public class Test3 {
    public static void main(String[] args) {
        ArrayDeque<Integer> nums = new ArrayDeque<>();
        nums.add(1000);
        nums.push(2000);
        nums.add(3000);
        nums.push(4000);
        Integer i1 = nums.remove();
        Integer i2 = nums.pop();
        System.out.println(i1 + ":" + i2);
    }
}
