package CSE;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Others.Person;

public class PersonMain {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(2);
        array.add(3);
        Collections.sort(array);

        for (Person person : people) {
            System.out.println(person.getName() + " - " + person.getAge());
        }
    }
}

