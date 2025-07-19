public class StaticNonstaticmethods02 {

    int j=10;


    //non static method
    void nonstaticmethod()
    {
        System.out.println(j);
        int j = 20;
        System.out.println(j);
        System.out.println("from non static block");
    }

    public static void main(String[] args) { //static method
        StaticNonstaticmethods02 obj = new StaticNonstaticmethods02();
        obj.nonstaticmethod();
    }
}
