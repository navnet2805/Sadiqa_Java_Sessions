package OOPSConcept.MultipleInheritance_Hybrid;

public class Childrunner implements Parent1,Parent2 {

   public void m1() {
        Parent1.super.m1(); // calling specific parent implementation
    }

    public static void main(String[] args) {
        Parent c = new Childrunner();

    }
}
