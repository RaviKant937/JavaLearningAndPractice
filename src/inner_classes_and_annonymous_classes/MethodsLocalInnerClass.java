package inner_classes_and_annonymous_classes;

public class MethodsLocalInnerClass {

    public static void justForFun(String abcd){
        String hello = "why are you saying hello at this hour of day?.";
        //we cannot create static class here.
//        static class Abc{
//            public static void oneMoreJustForFun(){
//                System.out.println(this.getClass().getSimpleName());
//            }
//        }
        class Abc{
            public void oneMoreJustForFun(){
                System.out.println(this.getClass().getSimpleName() + hello);
            }
        }
        Abc abc = new Abc();
        abc.oneMoreJustForFun();
    }
    public static void main(String[] args) {
        MethodsLocalInnerClass methodsLocalInnerClass = new MethodsLocalInnerClass();
        methodsLocalInnerClass.justForFun("sdf");

        MethodsLocalInnerClass.justForFun("sdf");
    }
}
