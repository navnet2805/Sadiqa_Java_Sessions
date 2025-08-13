package ExceptionProgram;

public class E03 {

    public static void divide(int a, int b)
    {
        if (b==0)
        {
            throw new RuntimeException("divide by zero");
        }

        int res = a/b;
        System.out.println(res);
    }

    public static void main(String[] args) {

        int a = 4;
        int b = 0;

        divide(a,b);

    }
}
