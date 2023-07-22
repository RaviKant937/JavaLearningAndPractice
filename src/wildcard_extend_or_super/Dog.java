package wildcard_extend_or_super;

import wildcard_extend_or_super.Animal;
public class Dog extends Animal{

    @Override
    Integer numberOfLegs() {
        return 4;
    }
}
