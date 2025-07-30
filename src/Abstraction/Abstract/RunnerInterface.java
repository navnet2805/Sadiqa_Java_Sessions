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

    public void fromChildmethodonly()
    {
        System.out.println("from child method only");
    }

    public void fromParentmethodonly()
    {
        System.out.println("from Parent method inherited to child");
    }

    public static void main(String[] args) {
        System.out.println(a); // can be used because it is static by default
        //a= 100 ; // throws error because the variable a is final by default.
        IntfPrgm obj = new RunnerInterface(); // Child's object with Parent Interface ref

        obj.fromParentmethodonly1(); // output will be from parent
        obj.fromParentmethodonly(); // output will be from child because methode implementation is overriden.
        //obj.fromChildtmethodonly(); this is not supported. this method is defined only in child class.
    }
}
