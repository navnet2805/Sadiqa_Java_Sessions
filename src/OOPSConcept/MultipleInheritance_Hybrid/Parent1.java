package OOPSConcept.MultipleInheritance_Hybrid;

public interface Parent1 extends Parent {

   default void m1()
   {
       System.out.println("from parent 1");
   }
}
