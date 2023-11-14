package streams;

import java.util.Map;
import java.util.TreeMap;

public class Testing {
    public static void main(String[] args) {
        Map<String, Integer> mymap = new TreeMap<>();
        mymap.put("abc",12);
        mymap.put("abcd",123);
        mymap.put("abcde",2312);
        mymap.put("abcdef",1234);
        mymap.put("abcdefg",1232);
        mymap.put("abcdefgh",1243);
        mymap.put("abcdefghi",1452);
        mymap.entrySet().stream().sorted(Map.Entry.comparingByKey()).
                forEach(stringIntegerEntry -> System.out.println(stringIntegerEntry.getKey() + " " + stringIntegerEntry.getValue()));
    }
}
