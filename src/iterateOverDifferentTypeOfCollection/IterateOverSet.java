package iterateOverDifferentTypeOfCollection;

import java.util.*;

public class IterateOverSet {
    public static void main(String[] args) {
        Set<String> s1 = new HashSet<>();
        s1.add("ravi");
        s1.add("kant");
        s1.add("hi");
        s1.add("hellp");
        s1.add("sdf");
        s1.add("sdsdf");
        s1.add("hsdfd");
        Iterator<String> iterator = s1.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        s1.stream().forEach(System.out::println);
        s1.forEach(str -> System.out.println(str));

        Set<Employee> s2 = new TreeSet<>(Comparator.comparing(Employee::getName));
        s2.add(new Employee("ravi", "Chandigarh", 123L, 1234L, 12345L));
        s2.add(new Employee("kant", "Chandigarh", 123L, 1234L, 12345L));
        s2.add(new Employee("kumar", "Chandigarh", 123L, 1234L, 12345L));
        s2.add(new Employee("aakash", "Chandigarh", 123L, 1234L, 12345L));
        s2.add(new Employee("zebra", "Chandigarh", 123L, 1234L, 12345L));
        System.out.println(s2);
    }
}
