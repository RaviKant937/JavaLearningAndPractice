package enumTesting;
interface MyInterface {
    enum Day {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    void printDay(Day day);
}

public class MyClass implements MyInterface {
    @Override
    public void printDay(Day day) {
        System.out.println("Today is " + day);
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.printDay(MyInterface.Day.MONDAY);
    }
}
