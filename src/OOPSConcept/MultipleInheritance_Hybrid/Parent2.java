package OOPSConcept.MultipleInheritance_Hybrid;

public interface Parent2 extends Parent{
    default void m1(){
        System.out.println("from parent2");
    }
}
