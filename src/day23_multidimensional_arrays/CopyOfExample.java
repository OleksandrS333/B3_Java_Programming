package day23_multidimensional_arrays;

import java.util.Arrays;

public class CopyOfExample {
    public static void main(String[] args) {

        int [] a = {1, 2, 3 };
        int [] b = a; // b is another array REFERENCE name but the actual array is same as the array a is pointing. So, there is only one array object


        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        a[0] = 10;
        b[1] = 200;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));



        System.out.println();
        int [] z = new int [a.length];
        for (int i = 0; i < z.length; i++) {
            z[i] = a[i];
        }
        System.out.println(Arrays.toString(z));


        System.out.println();
        int [] y = Arrays.copyOf(a, a.length);
        System.out.println(Arrays.toString(y));


        System.out.println();
        int [] x = new int [a.length*2];
        for (int i = 0; i < a.length; i++) {
            x[i] = a[i];
        }
        System.out.println(Arrays.toString(x));


        System.out.println();
        int [] k = Arrays.copyOf(a, a.length*2);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(k));


        k[1] = 500;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(k));




        System.out.println();
        int [] l = Arrays.copyOf(a, a.length-1);
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(l));



    }
}