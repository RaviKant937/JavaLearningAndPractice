package inner_classes;

public class InnerAndOuterClassStatic {
    private static String abcd = "hello aur kro chutiyapa.";
    static class InnerClass{
        public static void abc(){
            justForSatisfaction();
            System.out.println("inside abc function of inner class." + abcd);
        }
        public void xyz(){
            System.out.println("hello ji kaise ho.");;
        }
    }

    public static void justForSatisfaction(){
        System.out.println("satisfied.");
    }

    public static void main(String[] args) {
        InnerAndOuterClassStatic.InnerClass.abc();
    }
}
