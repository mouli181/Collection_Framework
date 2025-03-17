package HashMapEx;

import java.util.HashMap;

public class HashMapEx {
    public static void main(String[] args) {
        HashMap h = new HashMap();
        h.put("name","java");
        h.put("surname","spring");
        System.out.println(h);
        System.out.println(h.get("surname"));
    }
}
