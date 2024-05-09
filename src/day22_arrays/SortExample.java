package day22_arrays;

import java.util.Arrays;

public class SortExample {
    public static void main(String[] args) {

        int [] nums = {2, 23, 56, 2, 45, -2, 555};
        int [] notSorted = nums; //here I did not create a new array object. I just point to what the nums is
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(notSorted));


        System.out.println();
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(notSorted));


        // Max and Min
        System.out.println("Min: " + nums[0]);
        System.out.println("Max: " + nums[nums.length-1]);



    }
}