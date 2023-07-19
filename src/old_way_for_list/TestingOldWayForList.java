package old_way_for_list;

import java.util.ArrayList;
import java.util.List;

public class TestingOldWayForList {
    public static void addingElementsInList(List list){
        list.add(new String("Hi, you are inserting wrong entries."));
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        addingElementsInList(list);
        System.out.println(list);
    }
}