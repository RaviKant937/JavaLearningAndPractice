
public class StringBuilderAndStringBuffer {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hi");
        str.append(" mar jao khi jakar.");
        System.out.println(str);
        System.out.println(str.reverse());
        System.out.println("now the examples going on is for: String Buffer class: ");
        StringBuffer str2 = new StringBuffer("hi String Buffer: ");
        str2.append("hi hello");
        System.out.println(str2);
        System.out.println(str2.reverse());
    }
}
