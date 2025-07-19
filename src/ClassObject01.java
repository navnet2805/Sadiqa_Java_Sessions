public class ClassObject01 {



     ClassObject01() //default by JVM
    {
        System.out.println("from default constructor");
    }

    /*
    - no return type
    - it should nto be static

     */


    public static void main(String[] args) {
        ClassObject01 obj = new ClassObject01();
    }
}
