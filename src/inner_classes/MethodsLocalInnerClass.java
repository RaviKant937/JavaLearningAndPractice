package inner_classes;

public class MethodsLocalInnerClass {

    public static void justForFun(){
        //we cannot create static class here.
//        static class Abc{
//            public static void oneMoreJustForFun(){
//                System.out.println(this.getClass().getSimpleName());
//            }
//        }
        class Abc{
            public void oneMoreJustForFun(){
                System.out.println(this.getClass().getSimpleName());
            }
        }
        Abc abc = new Abc();
        abc.oneMoreJustForFun();
    }
    public static void main(String[] args) {
        MethodsLocalInnerClass methodsLocalInnerClass = new MethodsLocalInnerClass();
        methodsLocalInnerClass.justForFun();

        MethodsLocalInnerClass.justForFun();
    }
}
