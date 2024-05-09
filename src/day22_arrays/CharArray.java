package day22_arrays;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {

        String str = "loopcamp";
        char [] letters = new char[str.length()];

        for (int i = 0; i < str.length(); i++) {
            letters[i] = str.charAt(i);
        }

        System.out.println(Arrays.toString(letters));


        // The method .toCharArray(); converts the String into char [] -- this will do the same thing above
        char [] letters2 = str.toCharArray();
        System.out.println(Arrays.toString(letters2));


        System.out.println("----------");
        String word = "javav";

        //word.toCharArray(); //"java" ------ > ['j', 'a', 'v', 'a']
        //System.out.println(Arrays.toString(word.toCharArray()).substring(1, Arrays.toString(word.toCharArray()).length()-1));

        System.out.println(Arrays.toString(word.toCharArray()));

        for ( char each : word.toCharArray()) {
            System.out.println(each);
        }


        System.out.println("-----------");
        char [] letters3 =  {'j', 'a', 'v', 'a'};
        System.out.println(Arrays.toString(letters3));

        for ( char each : letters3) {
            System.out.println(each);
        }


        // This is how we convert the char Array into a String
        System.out.println("------------");
        char [] letters4  = {'h', 'e', 'l', 'l', 'o'};
        System.out.println("char: " + letters4[0]);
        System.out.println("char in int: " + (int)letters4[0]);
        String str2 = new String(letters4);
        System.out.println(str2);


        String [] words = {"hi", "bye"};
        //String str3 = new String(words); // INVALID - it only works with CHAR ARRAY


        char [] ascii = { 104, 105, 106, 107, 108};
        System.out.println("ascii: " + ascii[0]);
        String str4 = new String(ascii);
        System.out.println(str4);


        System.out.println("---------");

        String s = "Jerry";
        char []  ch = s.toCharArray();
        System.out.println(Arrays.toString(ch));

        String s2 = new String(ch);
        System.out.println(s2);





    }
}