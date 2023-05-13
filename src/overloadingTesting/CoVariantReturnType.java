package overloadingTesting;

class SuperClass{
    public SuperClass getInstance(){
        return new SuperClass();
    }
}

class SubClass extends SuperClass{
    public SubClass getInstance(String abc){
        return new SubClass();
    }
    public SuperClass getInstance(){
        return new SuperClass();
    }
}
public class CoVariantReturnType {
    public static void main(String[] args) {
        CoVariantReturnType coVariantReturnType = new CoVariantReturnType();
        SubClass subClass = new SubClass();
        System.out.println(subClass.getInstance().getClass().getSimpleName());
    }
}
