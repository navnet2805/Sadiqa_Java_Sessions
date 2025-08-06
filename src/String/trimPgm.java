package String;

public class trimPgm {

    public static void main(String[] args) {

        String s = "     Bangalore   ";
        System.out.println(s.trim().length());


        String s1 = "    Good     Morning   "; //0......... 15....100
        System.out.println(s1.trim().length());
        System.out.println(s1);
        System.out.println("==================================");


        String s3 =  "    Good   Morning   ";
        System.out.println(s3.split(" ").length);
        for (String c : s3.split("   ")) // [" ]
        {
            System.out.println(c);
        }
        System.out.println("================================");


        String s4 = "Java program";
        s4.substring(2); //v.....m
        System.out.println(s4.substring(2,6)); // from beginindex to endindex-1 // va


        String s5 = " ";
        System.out.println(s5.isBlank()); // no charact is present apart from null and space
        System.out.println(s5.isEmpty()); // some character is present
    }
}


//  Chrome
