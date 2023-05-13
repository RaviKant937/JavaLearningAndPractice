package OverridingMethods;

class SuperClass1{
    public void printMyName(String str){
        System.out.println("My name is: " + str);
    }
}

public class AccessModifier extends SuperClass1{
    @Override
    public void printMyName(String str) { //cannot put here public because of weaker access privileges.
        System.out.println("calling from child class: " + str);
    }

    public static void main(String[] args) {
        AccessModifier accessModifier = new AccessModifier();
        accessModifier.printMyName("ravi kant");
    }

}
