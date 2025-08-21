package Collection;

import java.util.Set;
import java.util.TreeSet;

public class Set03 {
    public static void main(String[] args) {

        Set num = new TreeSet();
        num.add(3);
        num.add(2);
        num.add(1);
        num.add("S4");
        num.add("S2");
        num.add("S1");
        num.add("S3");

//        num.add(null);
//        num.add(null);
//        num.add(null);

        System.out.println(num);
    }
}
