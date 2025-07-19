public class StaticNonstaticmethods03 {

    //static member
    static int a = 10;

    //non static member
    int b = 20;
    int j = 45;

    //static method
    static void m01()
    {
        int i = 3;
        System.out.println("from static block");
        System.out.println(a);
        //System.out.println(b); b is a nonstatic memeber
    }

    //non static methods
     void m02()
    {
        int j = 7;
        System.out.println("from static block");
        System.out.println(a);
        System.out.println(b);
    }


    public static void main(String[] args) {
        System.out.println(a);
        //System.out.println(b); //b is a nonstatic memeber
        StaticNonstaticmethods03 obj = new StaticNonstaticmethods03();
        //System.out.println(obj.i); //scope of i is only for m01 method
        System.out.println(obj.j); //value will be used from line number 8, but not from line number 22.
        System.out.println(obj.b);

    }
}
