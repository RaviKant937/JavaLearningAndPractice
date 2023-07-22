package functional_interfaces.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TryingSortingOnEmployee {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("Ravi Kant", "Hyderabas", 1, 1234567890L, 12345));
        employeeList.add(new Employee("divyansh gupta", "banglore", 0, 2334567890L, 34234));
        employeeList.add(new Employee("akash", "bihar", 8, 897895345L, 23432));
        employeeList.add(new Employee("suman", "andhra", 6, 346453234L, 432423));
        employeeList.add(new Employee("kartik", "mumbai", 2, 6734534L, 34234));
        employeeList.add(new Employee("ranveer", "jammu", 6, 5345234234L, 898234));
        Collections.sort(employeeList);
        System.out.println(employeeList);
        employeeList.sort((Employee emp1, Employee emp2) -> {
            if(emp1.getEnpId() > emp2.enpId) return -1;
            if(emp1.enpId == emp2.enpId) return 0;
            return 1;
        });
        Collections.sort(employeeList, (emp1, emp2) -> {
            if(emp1.phoneNumber > emp2.phoneNumber) return -1;
            if(emp1.phoneNumber == emp2.phoneNumber) return 0;
            return 1;
        });
        System.out.println(employeeList);
    }
}
