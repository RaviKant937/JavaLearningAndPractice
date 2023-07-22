package functional_interfaces.four_types_and_more;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateAndBIPredicate {
    public static void main(String[] args) {
        Predicate<String> simplePredicate = s1 -> s1.length()%2 == 0;
        System.out.println(simplePredicate.test("hiii"));

        BiPredicate<String, String> simpleBiPredicate = (s1, s2) -> (s1.length() + s2.length())%2 == 0;
        System.out.println(simpleBiPredicate.test("hhhh", "dsdfsdf"));
    }
}
