package utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>();
        l.add("banana");
        l.add("apple");
        l.add("orange");
        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);
    }
}
