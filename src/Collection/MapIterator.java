package Collection;

import java.util.*;

public class MapIterator {
    public static void main(String[] args) {

        //created a Hashmap object.
       // HashMap<Character, Integer> m = new HashMap(); // key are sorted.
        TreeMap<Character,Integer> m = new TreeMap();


        //insertion into map
        m.put('c',1);
        m.put('l',3);
        m.put('a',1);
        m.put('s',2);

        //printing the values
        System.out.println(m); // {a=1, c=1, s=2, l=3}

        System.out.println("===============================================");

        //advanced for loop
        for (Character c : m.keySet()) //m.keyset() ---> [a,c,l,s]
        {
            System.out.println(c);
        }

        System.out.println("===============================================");


        //iterator
        Iterator<Character> it =  m.keySet().iterator();
        while (it.hasNext())
        {
            System.out.println(it.next());
        }

        System.out.println("===============================================");






    }
}
