package inner_classes;

interface JustCalled{
    void printCurrentClass();
}


class SimpleClass{
    public void printCurrentClassFor(){
        System.out.println("from simple class");
//        System.out.println(this.getClass().getSimpleName());
        System.out.println("from simple class ended.");
    }
}

public class AnnonymousClass {
    public static void main(String[] args) {
        //implementing just one interface
        JustCalled justCalled = new JustCalled() {
            @Override
            public void printCurrentClass() {
                System.out.println("anonymous class");
                System.out.println(this.getClass().getSimpleName());
            }
        };
        justCalled.printCurrentClass();

        //implementing inner class and exetnding one class
        SimpleClass justCalled1 = new SimpleClass(){


//            @Override
//            public  void printCurrentClassFor(){
//                System.out.println(this.getClass().getSimpleName());
//            }
        };

        justCalled1.printCurrentClassFor();
    }
}
