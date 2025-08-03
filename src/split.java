public class split {

    public static void main(String[] args) {
        String s = "java is a good programming langugage"; //['j','a','v','a',' ','i'.....]
        String[] st = s.split(" "); //["java',"is","a","good","programming","language"]

        for (String x : st)
        {
            if (x.equals("programming"))
                continue;

            System.out.println(x);
        }
    }
}
