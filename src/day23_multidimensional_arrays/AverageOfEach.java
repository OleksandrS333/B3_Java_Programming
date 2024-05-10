package day23_multidimensional_arrays;

import java.util.Arrays;

/*

            Given a 2D array find the average of each inner array
            and extra: average of the whole array

            Ex:

                3, 4, 5, 6
                5, 2, 6
                10, 20, 30

 */
public class AverageOfEach {
    public static void main(String[] args) {

        int [][] nums = {
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 20, 30}
        };


        double totalSum = 0;
        int totalElem = 0;

        // OUTER LOOP will get each single dimensional array
        for ( int [] eachSingleArr : nums) {

            double sum = 0;

            // INNER LOOP will get each element in SINGLE DIMENSIONAL array
            for (int eachElem : eachSingleArr) {

                sum += eachElem;
                //totalSum += eachElem;

            }
            totalSum += sum;
            totalElem += eachSingleArr.length;

            System.out.println("Average of : " + Arrays.toString(eachSingleArr) + ": ----- " + sum / eachSingleArr.length );

        }
        System.out.println();
        System.out.println("2D array average: " + totalSum / totalElem);



    }
}
