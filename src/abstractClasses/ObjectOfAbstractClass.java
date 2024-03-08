package abstractClasses;

public class ObjectOfAbstractClass extends AbstractClassWithVarArgConstructor{

    public ObjectOfAbstractClass(){
//        super("abc","sdf","sfdds");
        this("abc");
    }

    public ObjectOfAbstractClass(String str){
        this("abc","def");
        System.out.println("hi hello: " + str);
    }
    public ObjectOfAbstractClass(String str1, String str2){
        System.out.println("hi hello: " + str1 + ", " + str2);
    }
    public static void main(String[] args) {
        ObjectOfAbstractClass objectOfAbstractClass = new ObjectOfAbstractClass();
    }

}
