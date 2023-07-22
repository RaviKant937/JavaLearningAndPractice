package binary_search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

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
    }
}
