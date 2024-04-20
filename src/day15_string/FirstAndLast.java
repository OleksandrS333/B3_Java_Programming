package day15_string;

import java.util.Scanner;

public class FirstAndLast {
    public static void main(String[] args) {
        Scanner key  = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = key.nextLine(); // Java is a fun coding language


        System.out.println(0 + sentence.charAt(0)); // this is not CONCATENATION. CONCATENATION happens if one side is STRING
        System.out.println(sentence.charAt(0)); // HERE WE DO NOT HAVE concatenation or addition.
        System.out.println(0 + sentence.charAt( sentence.length() - 1) );
        System.out.println(0 + sentence.charAt( sentence.length() - 1) );

        System.out.println("First char: " + sentence.charAt(0));
        System.out.println("Last char: " + sentence.charAt(   sentence.length() - 1)    );

    }
}