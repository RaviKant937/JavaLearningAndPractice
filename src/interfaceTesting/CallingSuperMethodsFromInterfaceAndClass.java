package interfaceTesting;


interface TestingOfSuperMethods{
    default void printMyName(String str){
        System.out.println("My name is:: " + str);
    }
}
public class CallingSuperMethodsFromInterfaceAndClass implements TestingOfSuperMethods{
    @Override
    public void printMyName(String str){
        TestingOfSuperMethods.super.printMyName("hii");
        System.out.println("go to hell");
    }

    public static void main(String[] args) {
        CallingSuperMethodsFromInterfaceAndClass callingSuperMethodsFromInterfaceAndClass = new CallingSuperMethodsFromInterfaceAndClass();
        callingSuperMethodsFromInterfaceAndClass.printMyName("sdf");
//        TestingOfSuperMethods.super.printMyName();
    }
}
