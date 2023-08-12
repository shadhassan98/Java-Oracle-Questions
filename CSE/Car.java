package CSE;

interface Rideable { 
    Car getCar (String name); 
}

class Car {
    private String name;
    public Car (String name) {
        this.name = name;
    }
    public  String toString(){
        return this.name;
    }
}

class CarMain{
    public static void main(String[] args) {
        Rideable rider = Car :: new; 
        Car vehicle = rider.getCar("MyCar");
        System.out.println(vehicle);
    }
}

