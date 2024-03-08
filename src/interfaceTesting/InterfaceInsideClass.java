package interfaceTesting;

import java.util.HashMap;
import java.util.Map;

class DemoClass{
    interface outer{
        void showMyName();
    }
    static void hi(){
        System.out.println("inside Democlass and in hi");
    }
}
interface inner{
    class abcd{
        public void canYouTouchMe(){
            System.out.println("Touched");
        }
    }
}

public class InterfaceInsideClass extends DemoClass implements DemoClass.outer,inner{
    public static void main(String[] args) {
        InterfaceInsideClass interfaceInsideClass = new InterfaceInsideClass();
        DemoClass.hi();
        interfaceInsideClass.showMyName();
        abcd abcd = new abcd();
        abcd.canYouTouchMe();
        Map<String,String> mymap = new HashMap<>();
    }

    @Override
    public void showMyName() {
        System.out.println("inside show Mhy Name class");
    }
}
