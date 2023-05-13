package interfaceTesting;
interface outer{
    void showMyName(String str);
    interface inner{
        void printMyName(String str);
    }
}


public class NestedInterface implements outer,outer.inner{
    @Override
    public void showMyName(String str) {
        System.out.println("Name is: " + str);
    }

    public static void main(String[] args) {
        NestedInterface nestedInterface = new NestedInterface();
        nestedInterface.showMyName("Ravi Kant Kumar");
        nestedInterface.printMyName("");
    }

    @Override
    public void printMyName(String str) {
        System.out.println("hello hi by");
    }
}
