package overloadingTesting;

public class ReturnType {
    //checking return number of argument
    public void f1(String s1,String s2,String... abc){
        System.out.println("f1: " + s1 + s2);
        for(String ab: abc){
            System.out.println(ab);
        }
    }
    public void f1(String s1,String s2, String s3){
        System.out.println("f12: " + s1 + s2 + s3);
    }

    //checking return type
    public void f2(String s1,String s2,String... abc){
        System.out.println("f1: " + s1 + s2);
        for(String ab: abc){
            System.out.println(ab);
        }
    }
    public String f2(String s1,String s2, String s3){
        System.out.println("f12: " + s1 + s2 + s3);
        return "a";
    }

    //checking access modifier
    private void f3(String s1,String s2,String... abc){
        System.out.println("f1: " + s1 + s2);
        for(String ab: abc){
            System.out.println(ab);
        }
    }
    public void f3(String s1,String s2, String s3){
        System.out.println("f12: " + s1 + s2 + s3);
    }
    public static void main(String[] args) {
        ReturnType returnType = new ReturnType();
        returnType.f1("sjfd","sdf","sdfds");//if only three parameters then     public void f1(String s1,String s2, String s3){ will be called but when more than 3 then var-arg will be calledd
        returnType.f2("sdf","sdf","ewr");
    }
}
