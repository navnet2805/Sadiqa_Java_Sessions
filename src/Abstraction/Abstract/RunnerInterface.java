package Abstraction.Abstract;

public class RunnerInterface implements IntfPrgm {

    public void disp()
    {
        System.out.println("from disp");
    }

    public void disp01()
    {
        System.out.println("from disp01");
    }

    public static void main(String[] args) {
        System.out.println(a);
        IntfPrgm obj = new RunnerInterface();

    }
}
