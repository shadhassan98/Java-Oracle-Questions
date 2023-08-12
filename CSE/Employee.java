package CSE;

import java.util.Optional;

class Employee {
    Optional<Address> address;
    Employee (Optional<Address> address) {
        this.address = address;
    }
    public Optional<Address> getAddress() { return address; }
}
class Address {
    String city = "New York";
    public String getCity() { return city; }
    public String toString() {
        return city;
    }
}

class MainAdd{
    public static void main(String[] args) {
        Address address = new Address();   // or null
        Optional<Address> addrs1 = Optional.ofNullable (address);
        Employee e1 = new Employee (addrs1);
        String eAddress = (addrs1.isPresent()) ? addrs1.get().getCity() : "City Not available";
        
        System.out.println(eAddress);
        //System.out.println(e1);
    }
    
}