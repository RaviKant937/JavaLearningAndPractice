package inner_classes;

interface Greeting {
    void greet();
}

class Shape {
    public void draw() { // Change protected to public
        System.out.println("Drawing a shape");
    }
}

/**
 * In simple words we cannot do this. means we cannot extends and implements in one annonymous class.
 */
public class AnnonymousClassWithImplementingAndExtending {
    public static void main(String[] args) {
        // Anonymous class implementing the Greeting interface and extending the Shape class
        Greeting greetingAndDrawing = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello from anonymous class implementing Greeting!");
            }

//            @Override
//            public void draw() { // Implement the draw() method
//                System.out.println("Drawing from anonymous class extending Shape!");
//            }
        };

        greetingAndDrawing.greet();
        ((Shape) greetingAndDrawing).draw(); // Casting to call the overridden draw() method
    }
}
