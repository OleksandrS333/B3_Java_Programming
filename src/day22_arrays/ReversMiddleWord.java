package day22_arrays;

import java.util.Arrays;

/*
    Have a sentence with 3 words
    reverse the middle word

    ex:
        java always fun

        output:
            java syawla fun
 */
public class ReversMiddleWord {
    public static void main(String[] args) {

        String str = "java always fun";

        String [] words = str.split(" "); // ["java", "always", "fun"]


        char [] letters = words[1].toCharArray(); // ['a', 'l', 'w', 'a', 'y', 's']
        String reverse = "";

        for (int i = letters.length-1; i >= 0 ; i--) {

            reverse += letters[i];

        }
        System.out.println(reverse);

        System.out.println(words[0] + " " + reverse + " " + words[2]);
    words[1] = reverse;
        System.out.println(Arrays.toString(words));
    String [] naaa = new String[words.length];
        for (int i = 0; i <naaa.length; i++) {
            naaa[i] = words[i];
        }
        System.out.println(Arrays.toString(naaa));




    }
}