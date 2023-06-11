package iterateOverDifferentTypeOfCollection;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class IterateOverPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Employee> que = new PriorityQueue<>(Comparator.comparing(Employee::getName));
        que.add(new Employee("ravi", "Chandigarh", 123L, 1234L, 12345L));
        que.add(new Employee("kant", "Chandigarh", 123L, 1234L, 12345L));
        que.add(new Employee("kumar", "Chandigarh", 123L, 1234L, 12345L));
        que.add(new Employee("zebra", "Chandigarh", 123L, 1234L, 12345L));
        while(!que.isEmpty()){
            System.out.println(que.peek());
            que.remove();
        }
    }
}
