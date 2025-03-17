package Queue;

import java.util.PriorityQueue;

public class Priority {
    public static void main(String[] args) {
       PriorityQueue p = new PriorityQueue();
       p.add(5);
       p.add(10);
       p.add(1);
       System.out.println(p);
       System.out.println(p.poll());
       System.out.println(p);
        System.out.println(p.peek());

    }
}
