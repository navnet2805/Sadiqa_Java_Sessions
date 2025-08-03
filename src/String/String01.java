package String;

public class String01 {

    public static void main(String[] args) {
        String s1 = new String("languge");

        String s2 = "Java"; // ['J','a','v','a']

        String s3 = "Python";

        s3.concat("home");

        String s4 = "home";
        String s5 = "home";

        System.out.println(s5.length());



        System.out.println(s4==s5);
        System.out.println(s2.charAt(3));
        System.out.println(s2.indexOf('J'));
        System.out.println(s2.lastIndexOf('a')); //string which has duplicate character. to find the last index character
    }



}
