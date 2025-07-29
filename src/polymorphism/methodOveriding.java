package polymorphism;

public class methodOveriding {

    static void Disp()
    {
        System.out.println("Implementation 1");
    }

    void Disp1()
    {
        System.out.println("from Disp1 parent");
    }

    void Disp2()
    {
        System.out.println("from disp2 parent");
    }

    public static void main(String[] args) {
//        Disp();
        methodOveriding obj = new methodOveriding();
        obj.Disp1();
    }
}
