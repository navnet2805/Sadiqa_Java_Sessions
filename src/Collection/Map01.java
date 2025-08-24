package Collection;

import java.util.HashMap;
import java.util.TreeMap;

public class Map01 {
    public static void main(String[] args) {

       TreeMap<Character, Integer> m = new TreeMap(); // key are sorted.
       m.put('c',1);
       m.put('l',3);
       m.put('a',1);
       m.put('s',2);
        System.out.println(m);

    }
}
