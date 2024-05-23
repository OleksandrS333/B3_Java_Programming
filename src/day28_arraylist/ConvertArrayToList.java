package day28_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class ConvertArrayToList {
    public static void main(String[] args) {


        //int []  arr = {1, 2, 3};
        Integer []  arr = {1, 2, 3, 4, 5, 6, 7, 8, 9}; // We made an Integer array

        Arrays.asList(arr); // Converted the array into a Collection type / Collection Data Structure (ArrayList)


        // ArrayList <Integer> l1 = Arrays.asList(arr); // THIS IS NOT VALID WAY TO USE IT.
        ArrayList <Integer> l1 = new ArrayList<>(Arrays.asList(arr)); //Created an ArrayList with values from array which was converted into Collection Type
        System.out.println(l1);


        // Creating an ArrayList with some INITIAL values
        ArrayList <Integer> l2 = new ArrayList<>(Arrays.asList(12, 453, 65, 23, 87, 4, 23, 6));
        System.out.println(l2);

        int [] kl = {1,3,4};
        Integer [] k = new Integer[kl.length];
        for (int i = 0; i <k.length; i++) {
            k[i]=kl[i];
        }
        ArrayList<Integer> m = new ArrayList<>(Arrays.asList(k));






    }
}