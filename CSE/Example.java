package CSE;

    public class Example {
        public static int add(int a, int b) {
            return a + b;
        }

        public static void prints(){
            System.out.println("hello");
        }
    
        public static void main(String[] args) {
            int x = 5;
            int y = 10;
    
            // Calling the 'add' method and assigning the result to the 'result' variable
            int result = Example.add(x, y);
            prints();
    
            // Printing the result
            System.out.println("The sum of " + x + " and " + y + " is: " + result);
        }
    }
    

