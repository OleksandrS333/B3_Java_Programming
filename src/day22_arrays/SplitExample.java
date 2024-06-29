package day22_arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SplitExample {

    public static void main(String[] args) {

        String str = "monday tuesday wednesday thursday friday saturday sunday";

        String [] days = str.split(" ");
        System.out.println(Arrays.toString(days));
        for ( String each : days) {
            System.out.println(each);
        }


        System.out.println();
        String [] withOutDay = str.split("day"); // ["]
        System.out.println(Arrays.toString(withOutDay));
        for ( String each : withOutDay) {
            System.out.println(each);
        }


        System.out.println();
        String str3 = "Jan-Feb-Mar_Apr-May-Jun-Jul-Aug-Sep_Oct_Nov_Dec";
        String [] arr1 = str3.split("-");
        for (String each : arr1) {
            System.out.println(each);
        }


        System.out.println();
        String str4 = "Hello world!";
        String [] all = str4.split("");
        for( String each : all) {
            System.out.println(each);
        }






    }

}
