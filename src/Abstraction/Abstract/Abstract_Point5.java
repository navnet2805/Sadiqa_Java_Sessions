package Abstraction.Abstract;

public abstract class Abstract_Point5 {

    static int i = 10;
    int j = 20;
    final int k = 11;

    Abstract_Point5() // constructor is allowed
    {
        this.j = j;
    }

    static void m01() // implemented method
    {
        System.out.println("from m01");
    }

   public abstract void m02();//abstract method

    public static void main(String[] args) {
       // Abstract_Point5 obj = new Abstract_Point5(); objects can not be created.
        m01(); // implemented method

    }

}
