package Arraya;

public class Array01 {
    public static void main(String[] args) {
        //int[] a = new int[-5]; // we get a run time exception "java.lang.NegativeArraySizeException"
        //int a[] = new int[5];
        int[] a = {4,8,22,4,51,9,10};

        int max = a[0];
        for (int a1 : a)
        {
            System.out.println(a1);
        }

    }
}
