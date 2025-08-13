package Arraya;

public class Array05 {

    public static void main(String[] args) {
        String s = "eabba ccddef";

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            boolean unique = true;
            for(int j=0; j<s.length(); j++) {
                if (s.charAt(i) == s.charAt(j) && i != j) {
                    unique = false;
                    break;
                }
            }
            if(unique == true){
                System.out.println(s.charAt(i));
                break;
            }
        }
    }
}
