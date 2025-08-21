package Collection;

import java.util.*;

public class List01 {

    public static void main(String[] args) {

       List numlist = List.of("naveen","Java",123,12.00,'g');

        System.out.println(numlist);

        for (Object o : numlist) // retreiving the elements
        {
            System.out.println(o);
        }
        System.out.println("===================================");

//        for (int index=0 ; index<numlist.size() ; index++) //using index
//        {
//            System.out.println(numlist[index]);
//        }
    }
}
