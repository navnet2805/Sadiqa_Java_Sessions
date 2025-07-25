package OOPSConcept;

public class Child01Class extends ParentClass{
    //non static variable
    int a = 71;

    Child01Class()
    {
        System.out.println("From Child constructor");
    }

    //static variable
    int b = 91;

    //Non static block
    {
        System.out.println("Non static block from child");
    }

    // static block
    static
    {
        System.out.println("static block from child");
    }

    //static method
    public static void fromparent01()
    {
        System.out.println("static method from child");
    }

    //non static method
    public void fromparentNS01()
    {
        System.out.println("non static method from child");
    }


    public static void main(String[] args) throws CloneNotSupportedException {

        //from child class
        Child01Class obj = new Child01Class();
        obj.fromparentNS01();
        fromparent01();
        System.out.println(obj.a);
        System.out.println(obj.b);

        //from the parent.
        obj.fromparentNS();
        fromparent();
        System.out.println(j);
        System.out.println(obj.i);

        //Object class
        obj.clone();




    }
}
