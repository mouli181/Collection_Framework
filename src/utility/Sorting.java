package utility;

import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(50);
        a.add(30);
        a.add(60);
        a.add(40);
        a.add(10);
        a.add(20);
        System.out.println(a);
        Collections.sort(a);
        System.out.println(a);

        List<Integer> b = Arrays.asList(20,10,30,10,50);
        int m = Collections.max(b);
        System.out.println(m);
        System.out.println(Collections.min(b));
        System.out.println(b.isEmpty());
    }
}
