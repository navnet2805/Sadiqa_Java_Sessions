package Collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set02 {
    public static void main(String[] args) {

        //[1,2,2,3,1, 4,2,5] ---> [1,2,3,4,5]
        //order is not maintained in Set

        Set num = new TreeSet();
        num.add(6);
        num.add(2);
        //num.add("java");
        //num.add(null); //null is allowed
        num.add(2); // any number of duplicates are not allowed
        num.add(2);
        num.add(4);
        num.add(2);
        num.add(2);
        num.add(2);
        //num.add("object");
        System.out.println(num);
    }
}
