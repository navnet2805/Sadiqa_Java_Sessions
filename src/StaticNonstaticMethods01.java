public class StaticNonstaticMethods01 {

    static int i=20;
    //static method
    static void staticmethod()
    {
        int i = 10; //static member
        System.out.println(i);
        System.out.println("from static method block");
    }

    //non static method
    void nonstaticmethod()
    {
        int j = 20;
        System.out.println("from non static block");
    }


    public static void main(String[] args) { //static method
        staticmethod(); //from static method to static method is accessible.
        StaticNonstaticMethods01.staticmethod(); //static methods can be accessed by its classname.
        System.out.println(i);
    }
}
