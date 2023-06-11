package generics;

import java.util.Objects;

public class HasCodeAndEqualsDigging {
    private String name;
    private Integer age;


    @Override
    public int hashCode() {
        int result = Objects.hash(name, age);
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj.getClass() == this.getClass() && obj.hashCode() == this.hashCode()) return true;
        return false;
    }

    public static void main(String[] args) {
        HasCodeAndEqualsDigging hasCodeAndEqualsDigging1 = new HasCodeAndEqualsDigging();
        HasCodeAndEqualsDigging hasCodeAndEqualsDigging2 = new HasCodeAndEqualsDigging();
//        System.out.println(hasCodeAndEqualsDigging2.name.hashCode());
//        System.out.println(hasCodeAndEqualsDigging1.name.hashCode());
        hasCodeAndEqualsDigging1.name = "ravi";
        hasCodeAndEqualsDigging2.name = "ravi";
        hasCodeAndEqualsDigging2.age = 1;
        hasCodeAndEqualsDigging1.age = 1234;
        System.out.println(hasCodeAndEqualsDigging1.age.hashCode());
        System.out.println(hasCodeAndEqualsDigging2.age.hashCode());
        if (hasCodeAndEqualsDigging2.equals(hasCodeAndEqualsDigging1)) {
            System.out.println("Both are equals");
        } else {
            System.out.println("Both are unequal");
        }

    }
}