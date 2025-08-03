package String;

public class doubleequaloperator {

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = new String("Java");
        String s3 = "C";
        String s4 = new String("ruby");
        String s5 = s2; // reference will be same.
        String s6 = s1;  // reference will be same.

        //== operator : will always compare the references
        //S1 is in heap area.
        //S2 is in SCP area.
        System.out.println(s1==s2); // False
        System.out.println(s1==s5); //false
        System.out.println(s2==s5); //true
        System.out.println(s6==s1); //true


        //equals() : will always compare the content
        //S1 value is Java
        //S2 value is Java
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s5)); //true
        System.out.println(s2.equals(s5)); //true
        System.out.println(s6.equals(s1)); //true

        Object o = new String("kj");
    }
}
