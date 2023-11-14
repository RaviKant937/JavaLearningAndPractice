package streams;

import javafx.util.Pair;

import java.util.*;
import java.util.stream.Collectors;

public class DifferentSetOfStreamMapList {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("ravi", 1223, "Bangalore"));
        personList.add(new Person("Divyansh",23, "Agra"));
        personList.add(new Person("Suman", 123, "Bihar"));
        Map<String, Integer> mymap = personList.stream().collect(Collectors.toMap(Person::getName, Person::getAge,
                (existing, newElement) -> existing,
                TreeMap::new));
        System.out.println(mymap);

        Vector<String> list = personList.stream().map(Person::getAddress).collect(Collectors.toCollection(Vector::new));
        Map<String, List<Integer>> mymap1= personList.stream().collect(Collectors.groupingBy(Person::getName, Collectors.mapping(Person::getAge, Collectors.toList())));

        Map<String, List<Pair<String,Integer>>> mymap2= personList.stream().
                collect(Collectors.groupingBy(Person::getName, Collectors.mapping(person -> new Pair<>(person.getName(), person.getAge()), Collectors.toList())));
        System.out.println(mymap1);
        System.out.println(mymap2);



    }
}
