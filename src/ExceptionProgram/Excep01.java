package ExceptionProgram;

public class Excep01 {

    public static void main(String[] args) {

        int a = 9;
        int b = 0;

        try {
            System.out.println(a / b); // importing some file.

            System.out.println("this is after performing divide operation");

            System.out.println("end of the program");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
