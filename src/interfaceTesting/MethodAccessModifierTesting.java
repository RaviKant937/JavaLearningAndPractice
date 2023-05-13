package interfaceTesting;
interface abcd{
    Integer a=1;
    static void printMyName(String str){
        System.out.println("String:: " + str);
    }
}

interface xyz extends  abcd{
    void printMyName(String str);
}

public class MethodAccessModifierTesting implements  xyz{
    public static void main(String[] args) {
        MethodAccessModifierTesting methodAccessModifierTesting = new MethodAccessModifierTesting();
        methodAccessModifierTesting.printMyName("ravi kant");
        abcd.printMyName("ravi");
    }

    @Override
    public void printMyName(String str) {
        System.out.println("from subclass: " + str);
    }
}
