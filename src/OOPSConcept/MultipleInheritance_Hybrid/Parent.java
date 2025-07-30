package OOPSConcept.MultipleInheritance_Hybrid;

public interface Parent {

    default void fromSuper()
    {
        System.out.println("from Super");
    }

    default void m1()
    {
        System.out.println("from parent");
    }
}
