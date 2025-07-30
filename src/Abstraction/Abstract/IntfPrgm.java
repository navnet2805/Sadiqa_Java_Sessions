package Abstraction.Abstract;

public interface IntfPrgm {

    int a = 8; // it is static and final

    //public by default
    void disp(); // abstract method without abstract keyword prefixed.

    //public by default
    abstract void disp01(); // abstract method.

    //default method
   default void disp02()
    {
        System.out.println("from default");
    }

    //static method
    static void disp03()
    {
        System.out.println("from static");
    }

}
