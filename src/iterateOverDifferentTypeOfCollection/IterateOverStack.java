package iterateOverDifferentTypeOfCollection;

import java.util.Stack;

public class IterateOverStack {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        st.add("ravi");
        st.push("kant");
        st.addElement("kumar");
        while(!st.empty()){
            System.out.print(st.pop() + ", ");
        }
        System.out.println();
        st.add("ravi");
        st.push("kant");
        st.addElement("kumar");
        while(!st.empty()){
            System.out.print(st.peek() + ", ");
            st.pop();
        }
    }
}
