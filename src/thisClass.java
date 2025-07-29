public class thisClass {

    int ears,nose,eyes,mouth,legs,hands;

    thisClass(int ears,int eyes,int mouth,int legs,int hands)
    {
        this.ears= ears;
        this.eyes = eyes; // we are initializing the variables
    }

    public void nsmeth()
    {
        System.out.println("from ns");
        this.ears = 1;
        System.out.println(this.ears);
    }



    public static void main(String[] args) {
        thisClass human = new thisClass(2,2,1,2,2);
        System.out.println(human.ears); // we are fetching the details
        System.out.println(human.eyes);
        human.nsmeth();
        System.out.println(human.ears);
    }
}
