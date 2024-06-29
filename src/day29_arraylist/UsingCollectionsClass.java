package day29_arraylist;

//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
import day08_scanner_logical_operators.Letters;

import java.net.Inet4Address;
import java.util.*;

public class UsingCollectionsClass {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(3, 6, 2, 27, 40, 234, 38));
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        Collections.reverse(list);
        System.out.println(list);

        ArrayList <Character> letters =new ArrayList<>(Arrays.asList('A', 'B', 'C', 'D'));
        System.out.println(letters);
        Collections.sort(letters);
        System.out.println(letters);
        Collections.reverse(letters);
        System.out.println(letters);

        Integer x = Collections.max(list);
        System.out.println(x);

        Collections.swap(letters, 0 ,3);
        System.out.println(letters);

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(11, 12, 20 , 11, 20 ,30));
        System.out.println(Collections.frequency(nums, 11));
    }
}
