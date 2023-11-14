package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class Primitive {
    private void intStreamExample(){
        IntStream.iterate(2,n -> n+2).
                limit(10).forEach(System.out::println);
        ArrayList intArray = new ArrayList(Arrays.asList(1,2,3,4,23,5));
        System.out.println(((List) intArray.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList())).get(3));

    }
    private void doubleStreamExample(){
        double[] dlist = {1.2,3.2,13.4,12.3};
        DoubleStream.of(dlist).forEach(System.out::println);
        double[] doubleList = DoubleStream.iterate(1.9, n->n*2).
                limit(10).toArray();
        DoubleStream.of(doubleList).forEach(System.out::println);
    }
    public static void main(String[] args) {
        Primitive primitive = new Primitive();
//        primitive.intStreamExample();
        primitive.doubleStreamExample();
    }
}
