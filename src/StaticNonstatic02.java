public class StaticNonstatic02 {

    //static variable
    static int a = 10;

    //non static variable
    int b = 56;

    //non static block
    {
        System.out.println("non static block");
    }

    static // static block
    {
        System.out.println("static block");
    }

    public static void main(String[] args) {
        StaticNonstatic02 obj = new StaticNonstatic02();
        //System.out.println(b); //we can not access not static directly
        obj.b = 100;
        obj.a = 200;
        System.out.println(obj.b); //100
        System.out.println(obj.a); //200
        System.out.println(StaticNonstatic02.a); //200  //using the class name we can access the static member

        StaticNonstatic02 obj1 = new StaticNonstatic02();
        obj1.b=40;
        System.out.println(obj1.b); //40
        System.out.println(a); //200
        System.out.println(obj1.a); //200

    }
}
