package inner_classes_and_annonymous_classes;

public class InnerAndOuterClass {
    static String abc;
    class InnerClass{
        public void justClassNameInner(){
            System.out.println(this.getClass().getSimpleName() + abc);
            System.out.println("calling outer class justClassName: " + justClassNameOuter());
        }
    }

    public String justClassNameOuter(){
        System.out.println(this.getClass().getSimpleName());
        return ", lo kr diya reutrn aur kuch.";
    }

    public static void main(String[] args) {
        abc = ", hello bsdwlaa";
        InnerAndOuterClass innerAndOuterClass = new InnerAndOuterClass();
        InnerAndOuterClass.InnerClass innerClass = innerAndOuterClass.new InnerClass();
        innerAndOuterClass.justClassNameOuter();
        innerClass.justClassNameInner();
    }
}
