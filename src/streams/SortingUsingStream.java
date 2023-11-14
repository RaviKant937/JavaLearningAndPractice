package streams;

import java.util.*;
import java.util.stream.Collectors;

public class SortingUsingStream {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("ravi", 1223, "Bangalore"));
        personList.add(new Person("Divyansh",23, "Agra"));
        personList.add(new Person("Suman", 123, "Bihar"));
        personList.stream().sorted(Comparator.comparingInt(Person::getAge).reversed().thenComparing((Person p1, Person p2) ->{
            if(p1.getAge() == p2.getAge()) return 1;
            return p1.getName().compareToIgnoreCase(p2.getName());
        })).forEach(System.out::println);
        Set<String> personName = personList.stream().map(Person::getName).collect(Collectors.toCollection(TreeSet::new));
        personList.stream().collect(Collectors.toMap(Person::getAge, Person::getAddress)); // Collectors.toMap(Person::getAge, Person::getAddress, (old, new) -> new, TreeMap::new)
                                                                                            // (old, new) -> this is merge function
                                                                                            //In the example I provided earlier, the merge function (existing, replacement) -> existing is used.
                                                                                            // This means that when duplicate keys are encountered, the existing value
                                                                                            // (the first encountered value) is retained, and the new value is discarded.
                                                                                            //So, in the resulting TreeMap, if there are duplicate keys (i.e., people of the same age), the address
                                                                                            // associated with the first person encountered will be kept, and the addresses of subsequent people with the
                                                                                            // same age will be ignored. This ensures that the resulting TreeMap contains unique age-to-address mappings.
//        System.out.println(personList);
    }
}
