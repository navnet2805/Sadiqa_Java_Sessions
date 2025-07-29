public class thismethod {

    int a,b,c;

    thismethod()
    {
        this(10,20);
        System.out.println("from default constructor");

    }

    thismethod(int i,int j)
    {
        this.a = i;
        this.b=j;
        System.out.println("from 2 param const");

    }


    public static void main(String[] args) {
        thismethod obj = new thismethod(); //default const
        //thismethod obj1 = new thismethod(10,20);

    }
}
