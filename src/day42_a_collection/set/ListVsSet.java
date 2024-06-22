package day42_a_collection.set;

import java.lang.reflect.Array;
import java.util.*;

public class ListVsSet {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); // Duplicates are OK, insertion order is kept
        list.add(4);
        list.add(10);
        list.add(1);
        list.add(2);
        list.add(-5);
        list.add(10);
        list.add(4);
        System.out.println(list);
        System.out.println(list.get(0)); // Since List, works with indexes, I can get the elements like this.
        System.out.println(list.get(list.size() - 1));


        Set<Integer> set = new HashSet<>(); //Duplicates are NOT OK, Insertion order is not Kept.
        set.add(4);
        set.add(10);
        set.add(1);
        set.add(2);
        set.add(-5);
        set.add(10);    // does not allow duplicate
        set.add(4);     // does not allow duplicate
        System.out.println(set);
        //System.out.println(set.get(0));
        //System.out.println(set.get(set.size()-1));
        // Since Set does not have indexes, we cannot get the elements in this way

        //Q: how can we get the elements
        //A: we can loop through Set and get the element. Lets, we want to get element 6
        for (Integer each : set) {
            if (each == -5) {
                System.out.println(each);
            }
        }


        for (Integer each : set) {
            System.out.println(each);
        }


        //Q: How can I sort my HashSet
        Set<Integer> sortedSet = new TreeSet<>(set);
        System.out.println(sortedSet);


        System.out.println();
        // Q: Remove duplicates from list
        //  - sort -TreeSet
        //  - no sort - HashSet, LinkedHashSet
        System.out.println(list);
        System.out.println(new LinkedHashSet<>(list));


        //Q: You have an array of int: Remove Duplicates and sort them
        int [] c = {2, 4, 23, 76, 2, 345, 2, 8, 4, -3, 2, -5};
        Integer [] a = new Integer[c.length];
        for (int i = 0; i <c.length; i++) {
            a[i] = c[i];
        }
//        System.out.println(Arrays.toString(a));
        // ArrayList <Integer> l = Arrays.asList(a);
        // Set <Integer> s = new TreeSet<>(l);
        System.out.println(       new TreeSet<>(Arrays.asList(a))         );




    }
}
