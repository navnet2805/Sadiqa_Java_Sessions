package ExceptionProgram;

public class E02 {
    public static void main(String[] args) {

        int a = 9;
        int b = 0;

        try {
            System.out.println(a / b);

            System.out.println("this is after performing divide operation");

            System.out.println("end of the program");
        } catch (Exception e) {
            System.out.println("exception caught");
        }
        finally {
            System.out.println("Always executed");
            /*
            close chrome
            status
            reset any value
             */
        }

    }
}
