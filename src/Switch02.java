public class Switch02 {

    public static void main(String[] args) {
        int day = 1;


        String result = switch (day) //1
        {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            default-> "No day";
        };

        System.out.println(result);
    }
}
