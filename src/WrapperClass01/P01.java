package WrapperClass01;

public class P01 {

    public static void main(String[] args) {

        String s = "10"; // non prmitive

        //to convert string type to int type ---> Wrapper clss
        System.out.println(Integer.parseInt(s)+10); //10+10 = 20
        System.out.println(s+10); //concat 1010

       // ====================================================================

//        String s1 = "Java";
//        System.out.println(Integer.parseInt(s1));
        // ====================================================================

         String b = "true"; // String value other than true will alway result in false for parseBoolean
        System.out.println(Boolean.parseBoolean(b));

        // ====================================================================
        Character c = 'h';

        int i = 10;
        Integer i1 = i;

        // ====================================================================
        String str = "Bool";





    }
}
