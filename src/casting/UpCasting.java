package casting;

import utils.Child;
import utils.Parent;

public class UpCasting {

    public static void main(String[] args) {
        Parent parent = new Child();
        //downcasting
        ((Child) parent).onlyMethodInChild();
    }
}
