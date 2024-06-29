package day27_wrapper_arraylist;

import my_utilities.ArrayUtil;

import java.util.Arrays;

public class UseAddElemMethod {
    public static void main(String[] args) {
        int [] a = {1, 3, 4, 7, 8};
        int [] b = {23, 345, 2, 0};

        int [] c = ArrayUtil.addElemInArr(a,b);
        System.out.println(Arrays.toString(c));

        System.out.println(ArrayUtil.maxNumInArr(c));
        System.out.println(ArrayUtil.minNumInArr(c));

    }
}
