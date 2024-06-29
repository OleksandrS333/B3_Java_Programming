package day19_nested_loops;

import java.util.Scanner;

public class ReverseMiddle {
    public static void main(String[] args) {
        String str = "I love java";
        int firstSpace = str.indexOf(" ");
        int lastSpace = str.lastIndexOf(" ");
        String middleWord = str.substring(firstSpace+1, lastSpace);
        String reversed = "";

        for (int i = middleWord.length()-1; i >= 0 ; i--) {
            reversed = reversed + middleWord.charAt(i);
        }
        System.out.println(str.substring(0,firstSpace+1)+ reversed + str.substring(lastSpace));
    }
}
