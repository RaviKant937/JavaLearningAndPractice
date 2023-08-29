package inner_classes_and_annonymous_classes;

class Superclass {
    void display() {
        System.out.println("Superclass display method");
    }
}

public class AnnonymousClassCallingMethodNotPresentInSuperClass {
    public static void main(String[] args) {
        Superclass superClass = new Superclass() {
            void newMethod() {
                System.out.println("Anonymous class newMethod");
            }
        };

        superClass.display();   // Calling superclass method

        // Uncommenting the line below will result in a compilation error,
        // because the `newMethod` is not part of the Superclass type.
        // superClass.newMethod();

        // However, you can access `newMethod` using reflection
        try {
            superClass.getClass().getDeclaredMethod("newMethod").invoke(superClass);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
