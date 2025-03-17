package TreeSet;

import java.util.ArrayDeque;
import java.util.Iterator;

public class DequeueEx {
    public static void main(String[] args) {
//        ArrayDeque l = new ArrayDeque();
//        l.add('h');
//        l.add(56.80);
//
//        System.out.println(l);
//
//        l.addFirst("Hii");
//        l.addLast("true");

//        System.out.println(l);

        ArrayDeque l1 = new ArrayDeque();
        l1.add(4.9);
        l1.add(90);
        l1.add("hi");
        l1.addLast("true");
//        for(int i=0;i<l1.size();i++) {
//            System.out.println(l1.getFirst());
//        }
//       System.out.println("Using for each");
//        for(Object a:l1) {
//            System.out.println(a);
//        }
        //Iterator i = l.iterator();
        System.out.println("Using Iterator");
        Iterator i = l1.iterator();

        while(i.hasNext()) {
            System.out.println(i.next());
        }

    }
}
