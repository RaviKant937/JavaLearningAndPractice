package inner_classes_and_annonymous_classes;

interface JustForRequirement{
    void doSomething();
}


public class AnnonymousClassButAsNormalClass {
    public static void main(String[] args) {
        JustForRequirement justForRequirement = new JustForRequirement() {
            int a=5;
            @Override
            public void doSomething() {
                System.out.println("doing something: " + a);
                a++;
                doneSomething();
            }

            public void doneSomething(){
                System.out.println("Something has been done: " + a);
            }
        };

        justForRequirement.doSomething();

    }
}
