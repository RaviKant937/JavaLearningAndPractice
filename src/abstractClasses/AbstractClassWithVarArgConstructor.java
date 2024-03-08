package abstractClasses;

public  abstract class AbstractClassWithVarArgConstructor {
    public AbstractClassWithVarArgConstructor(){
        System.out.println("default constructor of AbstractClassWithVarArgConstructor");
    }

    public AbstractClassWithVarArgConstructor(String str1, String str2){
        System.out.println("two string constructor is called: " + str1 + ", " + str2);
    }

    public AbstractClassWithVarArgConstructor(String str1, String ...abc){
        System.out.println("var arg constructor is called: " + str1);
        for(String str: abc){
            System.out.println(str);
        }
    }



    public static void main(String[] args) {

    }
}
