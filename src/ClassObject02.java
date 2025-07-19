public class ClassObject02 {

    String eyes = " ";
    int nose ;
    int mouth ;
    int ears ;

    ClassObject02(String eyes,int nose, int mouth, int ears) // parametarized constructor
    {
        this.eyes = eyes;
        this.nose = nose;
        this.mouth = mouth;
        this.ears = ears;
    }



    public static void main(String[] args) {

//        ClassObject02 obj = new ClassObject02(); //created an object
//        obj.eyes = "2";
//        obj.nose = 1;
//        obj.mouth = 1;
//        obj.ears = 2;
//
//        System.out.println(obj.ears);


        ClassObject02 obj = new ClassObject02("2",1,1,2);
        System.out.println(obj.ears);
    }
}
