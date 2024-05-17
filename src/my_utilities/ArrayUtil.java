package my_utilities;

import java.util.Arrays;

public class ArrayUtil {


    /**
     * This method returns the min number from array using sorted method
     * @param arr is the paramter that accepts array
     * @return the minimum number among all the numbers from array
     */
    public static int minNumInSortedArr (int [] arr) {
        Arrays.sort(arr);
        return arr[0];
    }


    /**
     * This method returns the min number from array using fori loop
     * @param arr is the paramter that accepts array
     * @return the minimum number among all the numbers from array
     */
    public static int minNumInArr (int [] arr) {

        int min = arr[0];

        for ( int eachNum : arr) {

            if (eachNum < min) {
                min = eachNum;
            }

        }

        return min;
    }



    /**
     * This method returns the max number from array using sorted method
     * @param arr is the paramter that accepts array
     * @return the maximum number among all the numbers from array
     */
    public static int maxNumInSortedArr (int [] arr) {
        Arrays.sort(arr);
        return arr[arr.length-1];
    }


    /**
     * This method returns the max number from array using fori loop
     * @param arr is the paramter that accepts array
     * @return the maximum number among all the numbers from array
     */
    public static int maxNumInArr (int [] arr) {

        int max = arr[0];

        for ( int eachNum : arr) {

            if (eachNum > max) {
                max = eachNum;
            }

        }

        return max;
    }


    /**
     * This method checks if the given number exists in the array
     * @param arr is the given array to be checked
     * @param num is the given number to check is it exists in array
     * @return boolean if given num exists in array or not.
     */
    public static boolean contains (int [] arr, int num) {

        //boolean result = false;
        for ( int eachNum : arr) {
            if (eachNum == num){
                return true;
            }
        }

        return false;
    }


    /**
     * This method returns new array with added element at the end
     * @param origArr is an array where we will add an element to the end
     * @param elemToAdd is the element we will add to the end
     * @return new array with added element
     */
    public static int [] addElemInArr (int [] origArr, int elemToAdd){


        int [] newArr = Arrays.copyOf(origArr, origArr.length+1);
        // {1, 2, 3, _}
        newArr[newArr.length-1] = elemToAdd;

        return newArr;
    }


    //TODO: create a reusable method that take 2 int array and return one array combined


    /**
     * This method finds the first matched element's index of int array
     * @param array is the parameter where we will check for the element
     * @param num is the parameter where we will check it there is match to it
     * @return the index if there is a match and -1 if there is no match.
     */
    public static int indexOf ( int [] array, int num) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == num){
                return i;
            }
        }
        return -1;
    }




    /**
     * This method finds the first matched element's index of String array
     * @param array is the parameter where we will check for the element
     * @param word is the parameter where we will check it there is match to it
     * @return the index if there is a match and -1 if there is no match.
     */
    public static int indexOf ( String [] array, String word) {

        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(word)){
                return i;
            }
        }

        return -1;
    }



    /**
     * This method sum up all the elements in int array
     * @param nums is the array where I get all the elements to sup up
     * @return the total of the all elements summed up.
     */
    public static int sum (int ... nums) {

        int sum = 0;
        for ( int each : nums) {
            sum += each;
        }
        return sum;
    }

}
