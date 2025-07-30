package OOPSConcept.polymorphism;

public class runner extends methodOveriding {

//    @Override
//    static void Disp()
//    {
//        System.out.println("Implementation 2");
//    }

    @Override
    void Disp1()
    {
        System.out.println("from Disp1 runner");
    }


    public static void main(String[] args) {
        runner obj1 = new runner();
        obj1.Disp1();
        obj1.Disp2();


    }

}
