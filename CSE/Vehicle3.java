package CSE;

class FuelNotAvailException extends Exception { }
class Vehicle {
    void ride() throws FuelNotAvailException  { //line n1 -- protected void ride() throws Exception 
        System.out.println("Happy Journey!");
    }
}

class SolarVehicle extends Vehicle {
    public void ride() throws Exception { //line n2
        super.ride();
    }
}

class Vehicle3 {
    public static void main (String[] args) throws FuelNotAvailException, Exception {
        Vehicle v = new SolarVehicle ();
        v.ride();
    }
}
