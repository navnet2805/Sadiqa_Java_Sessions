package OOPSConcept;

public class ParentClass {

    //non static variable
    int i = 7;
    int aP,bP;

    ParentClass(int a,int b)
    {
        this.aP = a;
        this.bP = b;
    }

    //static variable
    static int j = 9;

    ParentClass()
    {
        System.out.println("From Parent constructor");
    }

    //Non static block
    {
        System.out.println("Non static block from parent");
    }

    // static block
    static
    {
        System.out.println(" static block from parent");
    }

    //static method
    public static void fromparent()
    {
        System.out.println("static method from parent");
    }

    //non static method
    public void fromparentNS()
    {
        System.out.println("non static method from parent");
    }


    public static void main(String[] args) {
        ParentClass obj1 = new ParentClass();
        obj1.fromparentNS();
        fromparent();
        System.out.println(j);
        System.out.println(obj1.i);

    }
}
