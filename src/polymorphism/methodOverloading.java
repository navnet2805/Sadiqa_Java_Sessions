package polymorphism;

public class methodOverloading {



    static public void Display()
    {
        System.out.println("from display");
    }

    static void Display(int i)
    {
        System.out.println("from display int i ");
    }

   static void Display(int i, int j)
    {
        System.out.println("from display int i int j");
    }

    static void Display(double i)
    {
        System.out.println("from display double i");
    }

    public static void main(String[] args) {
        Display();
    }
}
