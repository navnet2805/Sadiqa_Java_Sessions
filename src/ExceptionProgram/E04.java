package ExceptionProgram;

import java.io.IOException;

public class E04 {

    public static void divide(int a, int b) throws ArithmeticException, IndexOutOfBoundsException
    {
        int res = a/b;
        System.out.println(res);
    }

    public static void main(String[] args) {

        int a = 4;
        int b = 0;

        divide(a,b);

    }
}
