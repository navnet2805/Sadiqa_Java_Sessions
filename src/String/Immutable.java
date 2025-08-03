package String;

public class Immutable {

    public static void main(String[] args) {
        String s1 = "tv";

        String s2 = new String("radio");

        String s4 = new String("radio");

        String s3 = "old";

         s1.concat("sony"); //---> contact operation for s1

        s3 = s3.concat("new");//?

        System.out.println(s1); // tv ----> immutable
        System.out.println(s2); //radio
        System.out.println(s3); //oldnew
    }
}
