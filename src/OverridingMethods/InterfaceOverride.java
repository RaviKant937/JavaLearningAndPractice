package OverridingMethods;

interface dinterface{
    public static void abcd(){
        System.out.println("from interface");
    }
    static void abcd2(){
        System.out.println("from interface abcd2");
    }
}
public class InterfaceOverride implements dinterface{
    public static void main(String[] args) {
        InterfaceOverride interfaceOverride = new InterfaceOverride();
        dinterface.abcd();
    }
}
