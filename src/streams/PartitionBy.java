package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PartitionBy {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "orange", "grape", "pear");
        Map<String, List<String>> groupingMap = words.stream()
                .collect(Collectors.groupingBy(
                        word -> {
                            int length = word.length();
                            if (length < 5) {
                                return "<5";
                            } else if (length == 5) {
                                return "=5";
                            } else {
                                return ">5";
                            }
                        },
                        Collectors.toList() // Collector for the values
                ));

        System.out.println(groupingMap);

        Map<Boolean, Long> partitionCount = words.stream()
                .collect(Collectors.partitioningBy(word -> word.length() > 5, Collectors.counting()));

        System.out.println("Count of words partitioned by length: " + partitionCount);

        // Partitioning words based on length
        Map<Boolean, List<String>> partitionedMap = words.stream()
                .collect(Collectors.partitioningBy(word -> word.length() > 5));

        System.out.println("Words partitioned by length: " + partitionedMap);

    }
}
