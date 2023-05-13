package OverridingMethods;

class SuperClass2{
    public void f1(String s1){
        System.out.println("SuperClass2: " + s1);
    }
}

public class OverridingDependOnObjectType extends SuperClass2{
    @Override
    public void f1(String str){
        System.out.println("main: " + str);
    }
    public static void main(String[] args) {
        SuperClass2 superClass2 = new OverridingDependOnObjectType();
        superClass2.f1("23");
    }
}
