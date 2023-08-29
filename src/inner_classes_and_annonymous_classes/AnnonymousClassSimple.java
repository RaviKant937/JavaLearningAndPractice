package inner_classes_and_annonymous_classes;

interface Greeting1 {
    void greet();
}

class Shape1 {
    void draw() {
        System.out.println("Drawing a shape");
    }
}

public class AnnonymousClassSimple {
    public static void main(String[] args) {
        // Anonymous class extending Shape and implementing Greeting
        Shape1 shapeWithGreeting = new Shape1() {
            @Override
            void draw() {
                System.out.println("Drawing from anonymous class extending Shape!");
            }

            void justForThinking(){
                System.out.println("thinking completed.");
            }
        };

        Greeting1 greeting = new Greeting1() {
            @Override
            public void greet() {
                System.out.println("Hello from anonymous class implementing Greeting!");
            }
        };

        shapeWithGreeting.draw();
        greeting.greet();
    }
}
