package ObjectCreation;

import OOPSConcept.ParentClass;
import polymorphism.methodOverloading;


public class Child extends Parent {

    int c=10, d=20;

    int t = 30;

    {
        System.out.println("from child");
    }

    public static void fromC()
    {
        System.out.println("From static child");
    }

    protected static void fromProtected() // protected method
    {
        System.out.println("From static child");
    }

    public void fromCns()
    {
        System.out.println("from ns child");
    }

    public static void main(String[] args) {
//      Parent c = new Child();   //dynamic dispatch

        methodOverloading.Display();

        Child c = new Child();
        Parent P= (Parent)c; // Upcasting

      c.fromCns();
      c.fromPns();
      fromC();
      fromP();
        //System.out.println(s1); // priavte variable from parent class is not accessible






    }
}
