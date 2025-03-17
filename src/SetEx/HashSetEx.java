package SetEx;

import java.util.HashSet;

public class HashSetEx {
    public static void main(String[] args) {
        HashSet h = new HashSet();
        h.add(10);
        h.add(20);
        h.add(30);
        h.add(10);
        h.add(40);
        h.add(20);
        System.out.println(h);
    }
}
