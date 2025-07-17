public class StaticNonstatic01 {
// 3, 2, 6, 10, 4, 1, 5, 4, 1, 5,
    {
        System.out.println("4");
    }

    static
    {
        System.out.println("3");
    }

    {
        System.out.println("1");
    }

    static
    {
        System.out.println("2");
    }

    public static void main(String[] args) {
        int i = 10;
        System.out.println(i);

        StaticNonstatic01 obj = new StaticNonstatic01();
        StaticNonstatic01 obj1 = new StaticNonstatic01();
    }

    {
        System.out.println("5");
    }

    static
    {
        System.out.println("6");
    }
}
