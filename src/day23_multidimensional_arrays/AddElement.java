package day23_multidimensional_arrays;

import java.util.Arrays;
import java.util.Scanner;

/*
    Have a starting array
    you want to add a number to the end
    so make your array bigger to store the new number

    Ex:
        {45, 123, 62}
        adding 100
        {45, 123, 62, 100}
 */
public class AddElement {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("How many elements in you first array you want to have: ");
        //int firstArraySize = key.nextInt();
        int [] firstArr = new int[key.nextInt()]; // 3

        //System.out.println("Please, enter your number of element one by one pressing enter");
        for (int i = 0; i < firstArr.length; i++) {

            System.out.print("Enter your data/value: ");
            firstArr[i] = key.nextInt();

        }


        System.out.println("First Array: " + Arrays.toString(firstArr));

        System.out.print("How many more elements do you want to add to the First Array: ");
        //int numsToAdd = key.nextInt(); // 2
        int [] secondArr = Arrays.copyOf(firstArr, firstArr.length + key.nextInt() ); // [11, 22, 33, 44, 55, _, _, _]


        for (int i = firstArr.length; i < secondArr.length; i++) { //[23, 66, 77, _, _]

            System.out.print("Enter your data/value to add: ");
            secondArr[i] = key.nextInt();

        }

        System.out.println("Second Array: " + Arrays.toString(secondArr));








    }
}