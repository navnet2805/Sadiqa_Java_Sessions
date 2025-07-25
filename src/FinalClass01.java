public class FinalClass01 {

    int i = 10;


    public static void main(String[] args) {

        final FinalClass01 obj = new FinalClass01();
        obj.i=23;
        System.out.println(obj.i);


//        obj = new FinalClass01(); // we can not reasisgn the new object
        System.out.println(obj.i);


    }
}
