package functional_interfaces.four_types_and_more;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateAndBIPredicate {
    public static void main(String[] args) {
        Predicate<String> simplePredicate = s1 -> s1.length()%2 == 0;
        System.out.println(simplePredicate.test("hiii"));

        Predicate<Integer> isPositive = num -> num > 0;
        Predicate<Integer> isEven = num -> num % 2 == 0;
        Predicate<Integer> isDivisibleBy3 = num -> num % 3 == 0;

        Predicate<Integer> positiveAndEven = isPositive.and(isEven);
        Predicate<Integer> positiveOrDivisibleBy3 = isPositive.or(isDivisibleBy3);
        Predicate<Integer> notPositive = isPositive.negate();

        System.out.println(positiveAndEven.test(4)); // true (4 is positive and even)
        System.out.println(positiveAndEven.test(5)); // false (5 is positive but not even)

        System.out.println(positiveOrDivisibleBy3.test(6)); // true (6 is positive and divisible by 3)
        System.out.println(positiveOrDivisibleBy3.test(-2)); // true (-2 is positive)
        System.out.println(positiveOrDivisibleBy3.test(7)); // true (7 is not positive but divisible by 3)

        System.out.println(notPositive.test(10)); // false (10 is positive)
        System.out.println(notPositive.test(-5)); // true (-5 is not positive)

        BiPredicate<String, String> simpleBiPredicate = (s1, s2) -> (s1.length() + s2.length())%2 == 0;
        System.out.println(simpleBiPredicate.test("hhhh", "dsdfsdf"));
    }
}
