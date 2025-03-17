package SetEx;

import java.util.LinkedHashSet;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        LinkedHashSet h = new LinkedHashSet();
        h.add(10);
        h.add(20);
        h.add(30);
        h.add(10);
        h.add(40);
        h.add(20);
        System.out.println(h);
    }
}
