package ListEx1;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
        a.add(10);
        a.add(20);
        a.add(30);
        a.add(40);
        System.out.println(a);
        a.add(20);
        a.add(40);
        System.out.println(a);
        System.out.println(a.get(4));
        List<Integer> b = new ArrayList<>();
        b.add(10);
        b.add(20);
        b.add(30);
        b.add(40);
        System.out.println(b);
        List<Integer> c = new ArrayList<>();
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        System.out.println(c);
        List<Integer> d = new ArrayList<>();
        d.addAll(b);
        d.addAll(c);
        System.out.println(d);


    }
}
