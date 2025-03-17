package ListEx;

import java.util.ArrayList;
import java.util.Stack;

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add("hii");
        a.add(20);
        System.out.println(a);

        System.out.println(a.contains(20));


        ArrayList<Integer> b = new ArrayList<>();
        b.add(100);
        b.add(200);
        System.out.println(b);

        ArrayList ad = new ArrayList();
        ad.addAll(a);
        ad.addAll(b);
        System.out.println(ad);

        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);

    }
}
