package day42_a_collection.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetObjects {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add(null);
        set.add("hello");
        set.add("$14.5");
        set.add("400");
        set.add("hello");
        set.add("%");
        System.out.println(set);


        Set<String> set2 = new LinkedHashSet<>();
        set2.add(null);
        set2.add("hello");
        set2.add("$14.5");
        set2.add("400");
        set2.add("hello");
        set2.add("%");
        System.out.println(set2);

        Set<String> set3 = new TreeSet<>();
//        set3.add(null);
        set3.add("hello");
        set3.add("$14.5");
        set3.add("400");
        set3.add("hello");
        set3.add("%");
        System.out.println(set3);
    }
}
