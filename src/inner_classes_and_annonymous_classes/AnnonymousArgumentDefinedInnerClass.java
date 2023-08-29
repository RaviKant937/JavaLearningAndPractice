package inner_classes_and_annonymous_classes;

import java.util.Arrays;
import java.util.List;

public class AnnonymousArgumentDefinedInnerClass {
    interface Operation {
        void perform(int number);
    }

    public static void processNumbers(List<Integer> numbers, Operation operation) {
        for (int number : numbers) {
            operation.perform(number);
        }
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Using argument-defined anonymous inner class to define behavior
        processNumbers(numbers, new Operation() {
            @Override
            public void perform(int number) {
                System.out.println("Squared: " + (number * number));
            }
        });

        // Using argument-defined lambda expression to define behavior
        processNumbers(numbers, number -> System.out.println("Cubed: " + (number * number * number)));
    }
}
