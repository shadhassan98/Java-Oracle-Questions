
package Others;

public class BuilderMain {
    public static void main(String[] args) {
        Person person = new Person.PersonBuilder("John", "Doe")
                .address("123 Main St")
                .build();

        System.out.println(person);
    }
}
