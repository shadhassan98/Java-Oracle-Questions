package CSE;
class Vehicle {
    int distance;

    Vehicle (int x) {
    this.distance = x;
    }
    public void increSpeed(int time) {
        int timeTravel = time; //line n1
        class Car {
            int value = 0;
            public void speed () {
                value = distance /timeTravel; //line n2
                System.out.println ("Velocity with new speed "+value+" kmph");    
            } 
            public static void prints(){
                System.out.println("hello");
            }   
        }
        
        Car bmw = new Car();
        bmw.speed(); //line n3
        Car.prints();
    }
    public static void main(String[] args) {
        Vehicle v = new Vehicle (100);
        v.increSpeed(50);
    }
}

