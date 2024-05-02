package day19_nested_loops;
/*
    Remove Duplicates
        Write a program that can remove duplicates from a String
         Ex:
                Input: abcabbcd
                Output: abcd
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        String original = "abcabbcd"; // String literals
        String unique = "";

        // loop through and get each character
        //      add this each character into another container

        for (int i = 0; i < original.length(); i++) {

            char eachLetter = original.charAt(i);

            if (!unique.contains(""+eachLetter)){
                unique += eachLetter;
            }

        }

        System.out.println("Original:\t" + original);
        System.out.println("Unique:\t\t" + unique);


/*
        // Thi sis the 2nd option with continue;
        for (int i = 0; i < original.length(); i++) {

            char eachLetter = original.charAt(i);

            if (unique.contains(""+eachLetter)){
                continue;
            }
            unique += eachLetter;

        }
 */


    }
}