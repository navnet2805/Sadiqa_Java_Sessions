package OOPSConcept.polymorphism;

import OOPSConcept.ObjectCreation.Child;

public class protectedfromChildclass extends Child {

    public static void main(String[] args) {
        protectedfromChildclass obj = new protectedfromChildclass();
        fromProtected(); // protected method from Child class.

    }
}
