package SetEx;

import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        TreeSet<String> t = new TreeSet<>();
        t.add("mango");
        t.add("banana");
        t.add("apple");
        t.add("mango");
        System.out.println(t);
    }
}
