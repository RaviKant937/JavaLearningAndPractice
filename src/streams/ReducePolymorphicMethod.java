package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReducePolymorphicMethod {
    public static void main(String[] args) {
        List<Integer> newList = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        Integer finalAnser = newList.stream().reduce(0, (a,b) -> a+b);
        Optional<Integer> optionalInteger = new ArrayList<Integer>(Arrays.asList(3,4,65)).stream().reduce((a,b) -> a+b);
        System.out.println("newList answer is: " + finalAnser + ", optionalInteger is : " + optionalInteger);
    }
}
