package enumTesting;
//package enumTesting;enumTesting

enum Day {
    MONDAY("FirstDay",1),
    TUESDAY("Second Day", 2),
    WEDNESDAY("third day", 3),
    THRUSDAY("Fourth day", 4),
    FRIDAY("fifth day", 5),
    SATURDAY("Sixth day", 6),
    SUNDAY("Seventh Day", 7);

    Day(String str,int i) {
    }
}


public class EnumTesting {
    public static void main(String[] args) {
        Day d = Day.FRIDAY;
        System.out.println(Day.values().toString());
//        System.out.println("heiii");
    }
}
