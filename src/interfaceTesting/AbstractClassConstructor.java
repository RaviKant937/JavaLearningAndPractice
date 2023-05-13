package interfaceTesting;
abstract class AbstractClass{
    public AbstractClass(){
        System.out.println("hiii we are in abstract class constructor.");
    }
}

class Abcd extends AbstractClass{
    public Abcd(){
        System.out.println("Hiii we are in abcd class.");
    }
}

public class AbstractClassConstructor {
    public static void main(String[] args) {
        AbstractClass abstractClass = new Abcd();
    }
}
