package Map;

import java.util.HashMap;
import java.util.TreeMap;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap h = new HashMap();
        h.put("one",2);
        h.put("two",1);
        h.put("third",3);
        System.out.println(h);

        TreeMap t = new TreeMap();
        t.put("one",1);
        t.put("two",2);
        t.put("four",4);
        System.out.println(t);
    }
}
