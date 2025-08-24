package Collection;

import java.util.Map;
import java.util.TreeMap;

public class Map_Key_Value_print {

    public static void main(String[] args) {

        //created a Hashmap object.
        // HashMap<Character, Integer> m = new HashMap(); // key are sorted.
        TreeMap<Character,Integer> m = new TreeMap();


        //insertion into map
        //String = "clllass" -- print only the duplicate characters
        m.put('c',1);
        m.put('l',3);
        m.put('a',1);
        m.put('s',2);

        //printing the values
        System.out.println(m); // {a=1, c=1, s=2, l=3}


        //print key and value using for loop
        for (Map.Entry<Character,Integer> map: m.entrySet()) //entryset will have key and value ---> it has 2 data types.
        {
            System.out.println(map.getKey() + "-->" + map.getValue());
        }

        System.out.println("=====================================================");
        //print only unique characters
        for (Map.Entry<Character,Integer> map: m.entrySet()) //entryset will have key and value ---> it has 2 data types.
        {
            if (map.getValue()==1)
                System.out.println(map.getKey());
        }

        System.out.println("=====================================================");
        //print only the duplicate characters
        for (Map.Entry<Character,Integer> map: m.entrySet()) //entryset will have key and value ---> it has 2 data types.
        {
            if (map.getValue()>1)
                System.out.println(map.getKey());
        }
    }
}
