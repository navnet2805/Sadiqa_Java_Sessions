package Collection;

import java.util.PriorityQueue;

public class Queue01 {

    public static void main(String[] args) {


        PriorityQueue n = new PriorityQueue<Integer>();
        n.add(8);
        n.add(7);
        n.add(10);
        System.out.println(n);
        n.remove();
        System.out.println(n);
    }
}
