package Collection;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class Queue02 {
    public static void main(String[] args) {

        ArrayDeque n = new ArrayDeque();
        n.add(8);
        n.add(7);
        n.add(10);
        System.out.println(n);
        n.remove();
        System.out.println(n);
    }
}
