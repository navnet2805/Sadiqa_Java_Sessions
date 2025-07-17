public class StaticNonstatic03 {

    //static variable
    static int a = 10;

    //non static variable
    int b = 56;


    public static void main(String[] args) {
        System.out.println("Value of a: " +a); //10
        // System.out.println("value of b: " +b);

        StaticNonstatic03 obj = new StaticNonstatic03();
        obj.b=100;
        obj.a=30;
        System.out.println(obj.b); //100
        System.out.println(obj.a); //30
        System.out.println(a);     //10 -- 30

        StaticNonstatic03 obj1 = new StaticNonstatic03();
        System.out.println(obj1.b); //56
        System.out.println(obj1.a); //10  --30
        System.out.println(a);      //10 -- 30



    }
}
