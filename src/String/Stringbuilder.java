package String;

public class Stringbuilder {

    public static void main(String[] args) {

        String str = "Good";

        StringBuilder s = new StringBuilder();  // empty stringbuilder is created.
        //String s2 = "";

        StringBuilder s1 = new StringBuilder("Bad"); //StringBuild is created with literal value Bad.
       // String s3 = "Bad";

        System.out.println(str); //Good
        str.concat("morning");
        System.out.println(str); //immutable in nature

        System.out.println("==================================");
        System.out.println(s1); //Bad
        s1.append("morning");
        System.out.println(s1); //mutable in nature
        System.out.println(s1.reverse()); // reverse method

    }
}
