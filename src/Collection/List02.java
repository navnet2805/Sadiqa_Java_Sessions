package Collection;

import java.util.ArrayList;
import java.util.List;

public class List02 {
    public static void main(String[] args) {

        List num = new ArrayList(); //creating object of ArrayList class and assigning it to List interface.
        num.add("java");
        System.out.println(num);
        num.add("Program");
        num.add(3); //int
        num.add(3); // duplicate
        num.add('c'); //char
        num.add(null);
        System.out.println(num);
        num.add(1,"and"); //using index we can add the value
        System.out.println(num);
        System.out.println(num.get(2));
        System.out.println(num.size()); //5
    }
}
