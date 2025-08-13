package Arraya;

public class Array04 {

    public static void main(String[] args) {
        int[] a = new int[5];
        int count = 1;

        for (int i=0 ; i<2 ; i++) // till 2nd element
        {
            a[i] = count++;
        }

        for (int r : a) // print all value.
        {
            System.out.println(r);
        }
    }
}
