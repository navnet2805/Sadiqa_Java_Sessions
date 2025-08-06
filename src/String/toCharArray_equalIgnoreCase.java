package String;

public class toCharArray_equalIgnoreCase {
    public static void main(String[] args) {
        //toCharArray ---- each cahar will be an eleemnt in the Array. --> Array of a specific data type


        String s = "ChottaBheem";

        //equalIgnoreCase
        if (s.equalsIgnoreCase("Chottabheem")) //true
        {
            System.out.println("true");
        }

        //toCharArray
        for (char c : s.toCharArray()) //['C','h','o','t','a',' ','B'......'m]
        {
            System.out.print(c);
            System.out.print(c);
        }




    }
}
