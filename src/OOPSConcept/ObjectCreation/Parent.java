package OOPSConcept.ObjectCreation;

public class Parent extends Object{
    int a=10, b=20;

    int s = 30;

   private static int s1 = 40; //private variable

    {
        System.out.println("from parent");
    }

    public static void fromP()
    {
        System.out.println("From static parent");
    }

    public void fromPns()
    {
        System.out.println("from ns parent");
    }

    public void fromCns()
    {
        System.out.println("from ns child new");
    }

    public static void main(String[] args) {
        Object obj = new Parent();
        System.out.println(s1); //usage of private variable

    }
}
