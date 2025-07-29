package OOPSConcept;

public class Child01Class extends ParentClass{
    //non static variable
    int a = 71;
    int aC,bC;

    Child01Class()
    {
        System.out.println("From Child constructor");
    }

    Child01Class(int a,int b)
    {
        super.aP=a;
        this.bC = b;
        System.out.println("From Child 2 param constructor");
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


    public static void main(String[] args){

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


        Child01Class objnew = new Child01Class(9,8);






    }
}
