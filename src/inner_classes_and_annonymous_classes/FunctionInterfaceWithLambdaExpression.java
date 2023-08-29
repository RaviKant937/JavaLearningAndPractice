package inner_classes_and_annonymous_classes;

@FunctionalInterface
interface JustForTesting{
    void doSomething(String str);
}

public class FunctionInterfaceWithLambdaExpression {

    public static void main(String[] args) {
        JustForTesting justForTesting = (String str) -> {
            System.out.println(str + "done Something.");
        };
        justForTesting.doSomething("hello, ");
    }
}
