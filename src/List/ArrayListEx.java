package List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(20);
        l.add(30);
        l.add(20);

        for(Integer o : l){
            System.out.println(o);
        }

        System.out.println(l.get(1));
        System.out.println(l);


        List<String> l1 = new ArrayList<>();
        l1.add("welcome");
        l1.add("to");
        l1.add("collection");
        System.out.println(l1);

        List l2 = new ArrayList();
        l2.addAll(l);
        l2.addAll(l1);
        System.out.println(l2);
    }
}
