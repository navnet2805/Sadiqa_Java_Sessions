package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList01 {

    public static void main(String[] args) {

       ArrayList<Integer> n = new ArrayList();
       n.add(7);
       n.add(6);
       n.add(10);
       n.add(2);
        Collections.sort(n);
        System.out.println(n);

    }
}
