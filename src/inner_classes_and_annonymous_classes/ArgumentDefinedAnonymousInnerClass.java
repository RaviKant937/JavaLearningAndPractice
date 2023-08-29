package inner_classes_and_annonymous_classes;

interface ForExample{
    void doSomething();
}

public class ArgumentDefinedAnonymousInnerClass {
    public static void doingSomething(ForExample forExample){
        forExample.doSomething();
    }

    public static void main(String[] args) {
        doingSomething(new ForExample() {
            @Override
            public void doSomething() {
                System.out.println("do something of interface");
            }
        });
    }
}
