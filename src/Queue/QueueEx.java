package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {
    public static void main(String[] args) {
        Queue q = new LinkedList();
        q.offer("first");
        q.offer("second");
        q.offer("third");
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q.peek());
        System.out.println(q);
    }
}
