package functional_interfaces.binary_search;

import utils.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PracticingBinarySearch {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(6);
        list.add(6);
        list.add(6);
        list.add(9);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(4);
        list.add(3);
        list.add(2);
        Collections.sort(list, Comparator.naturalOrder());
        System.out.println(list);
        int index = Collections.binarySearch(list, 6, Comparator.naturalOrder());
        System.out.println(index);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("ravi", 1L, "Patna"));
        employeeList.add(new Employee("divyansh", 2L, "agra"));
        employeeList.add(new Employee("ajay", 3L, "gorakhpur"));

        index = Collections.binarySearch(employeeList, new Employee("chutiya", 1L), Comparator.comparing(Employee::getEnpId));
        System.out.println(index);

    }
}
