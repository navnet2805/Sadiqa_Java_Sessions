public class BreakwithLabel {

    public static void main(String[] args) {

        outer: //label
        for (int j=1 ; j<=3 ; j++) {
            for (int i = 1; i <= 20; i++) {
                if (i == 5)
                    break outer; // break with label -> as per this program break will come
                //out of the outer for loop and line number 16 will be executed.
                System.out.println(i);
            } // inner loop
            System.out.println("--------------------");

        } //outer loop
        System.out.println("outer for loop");
    }
}
