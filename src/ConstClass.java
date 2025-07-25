public class ConstClass {

    //features of a class
    int a = 2;
    int b = 5;
    int c = 8;
    int f = 10;
    int h = 19;
    int k = 30;


    ConstClass()
    {

    }

    ConstClass(int a, int b)// 2 param constructor
    {
        this.a = a;
        this.b = b;
        System.out.println("Obj1");
    }

    ConstClass(int a, int b, int c)// 3 param constructor
    {
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println("Obj2");
    }


    ConstClass(int a, int b, int c, int f) // 4 param constructor
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.f = f;
        System.out.println("Obj3");
    }


    public static void main(String[] args) {
        ConstClass obj1 = new ConstClass(2, 3);
        ConstClass obj2 = new ConstClass(2, 3, 5);
        ConstClass obj3 = new ConstClass(1, 2, 3, 4);
        ConstClass obj4 = new ConstClass();


    }
}
