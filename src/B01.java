public class B01 {

    public static void main(String[] args) {

String s = "naveen";
        for (int j=1 ; j<8 ; j++) {
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0)
                    System.out.println(i + " is even");
                else if (i == 5)
                    System.out.println(i + " is odd ---> ;Line number 10");
                else
                    System.out.println(i + " is odd");
            }
        }
    }
}

