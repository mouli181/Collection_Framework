package List;

import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(40);
        s.push(20);
        s.push(30);
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
        System.out.println(s.peek());
    }
}
