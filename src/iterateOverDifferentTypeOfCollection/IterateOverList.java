package iterateOverDifferentTypeOfCollection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IterateOverList {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>(){{
            add("Ravi");
            add("Kant");
            add("Kumar");
        }};
        list.stream().forEach(str -> System.out.print(str + ", "));
        System.out.println();
        list.forEach(str -> System.out.print(str + ", "));
        System.out.println();
        Iterator<String> itr = list.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next() + ", ");
        }
        System.out.println();
        ListIterator<String> listIterator = list.listIterator();
        while(listIterator.hasNext()){
            System.out.print(listIterator.next() + ", ");
        }

    }
}
