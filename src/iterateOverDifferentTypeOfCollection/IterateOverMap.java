package iterateOverDifferentTypeOfCollection;

import java.util.HashMap;
import java.util.Map;

public class IterateOverMap {
    public static void main(String[] args) {
        Map<String, String> mymap = new HashMap<String, String>(){{
            put("Ravi","kant");
            put("Ranveer", "Singh");

        }};
        for(Map.Entry<String, String> entry : mymap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        mymap.entrySet().stream().forEach(System.out::println);

    }
}