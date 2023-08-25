package functional_interfaces.four_types_and_more;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;

public class FuntionAndBiFunction {

    public static void main(String[] args) {
        Function<String, List<String>> simpleFunction = s -> Arrays.asList(s.split(","));
        List<String> separateFromCSV = simpleFunction.apply("hi,my name is ravi");
        System.out.println(separateFromCSV);
        Function<Integer, Integer> addOne = num -> num + 1;
        Function<Integer, Integer> multiplyByTwo = num -> num * 2;
        Function<Integer, Integer> subtractThree = num -> num - 3;

        Function<Integer, Integer> addOneThenMultiplyByTwo = addOne.andThen(multiplyByTwo);
        Function<Integer, Integer> multiplyByTwoThenSubtractThree = multiplyByTwo.andThen(subtractThree);

        System.out.println(addOneThenMultiplyByTwo.apply(5)); // (5 + 1) * 2 = 12
        System.out.println(multiplyByTwoThenSubtractThree.apply(5)); // (5 * 2) - 3 = 7

        BiFunction<String, String, List<String>> simpleBiFunction = (s1, s2) -> {
            List<String> l1 = new ArrayList<>(Arrays.asList(s1.split(",")));
            l1.addAll(Arrays.asList(s2.split(","))); // Change s1 to s2 here
            return l1;
        };

        separateFromCSV = simpleBiFunction.apply("hello,ji,i", "bolo,ji,sd");
        System.out.println(separateFromCSV);
    }
}
