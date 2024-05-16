package my_utilities;

public class StringUtil {


    /**
     * Returns the reversed version of string.
     *
     * @return  the reversed sequence of characters in String
     */
    public static String reverse (String word) {
        String reversed = "";
        for (int i = word.length() - 1 ; i >= 0 ; i--) {

            reversed += word.charAt(i);
        }
        return reversed;
    }


    /**
     * Returns the formatter version of string.
     *
     * @return  the first letter in UPPER case and rest in LOWER case as a String
     */
    public static String fixFormat (String str) {

        String result = "";

        // result = (str.charAt(0)+"").toUpperCase() + str.substring(1).toLowerCase();
        result = str.substring(0, 1).toUpperCase() + str.substring(1).toLowerCase();

        return result;
    }


    /**
     * Returns the number of the characters repeated in String
     * @param word is the String that the method will check
     * @param letter is the char the the method will check how many times it appear
     * @return the number of the letter that occurred in String
     */
    public static int frequencyOfCharacters (String word, char letter) {

        int count = 0;
        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == letter) {
                count++;
            }

        }

        return count;
    }


    /**
     * This method returs only the UNIQUE characters
     * @param str is the word that is being checked for uniques chars
     * @return the unique letter as a String
     */
    public static String uniqueCharacters (String str) {


        String unique = "";

        for (int i = 0; i < str.length(); i++) { // hello

            char eachLetter = str.charAt(i);


            if (frequencyOfCharacters(str, eachLetter) == 1) {
                unique += eachLetter;
            }

        }

        return unique;
    }


}
