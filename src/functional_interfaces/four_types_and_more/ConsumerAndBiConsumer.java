package functional_interfaces.four_types_and_more;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerAndBiConsumer {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Alice", "Bob", "Charlie"));
        Consumer<List<String>> printNames = list -> {
            for (String name : list) {
                System.out.println(name);
            }
        };
        printNames.accept(names);

        Consumer<String> printMessage = msg -> System.out.println("Printing: " + msg);
        Consumer<String> printUpperCase = msg -> System.out.println("UpperCase: " + msg.toUpperCase());
        Consumer<String> printLowerCase = msg -> System.out.println("LowerCase: " + msg.toLowerCase());

        // Compose a chain of consumers using andThen()
        Consumer<String> printMessageChain = printMessage.andThen(printUpperCase).andThen(printLowerCase);

        // Use the chain of consumers
        printMessageChain.accept("Hello, World!");


        Map<String, Integer> ages = new HashMap<>();
        BiConsumer<String, Integer> addAge = (name, age) -> ages.put(name, age);
        addAge.accept("Alice", 30);
        addAge.accept("Bob", 25);
        addAge.accept("Charlie", 28);

        // Printing the map using BiConsumer
        BiConsumer<String, Integer> printNameAndAge = (name, age) -> System.out.println(name + ": " + age);
        ages.forEach(printNameAndAge);
    }
}
