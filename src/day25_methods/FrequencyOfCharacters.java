package day25_methods;

import my_utilities.StringUtil;

/*
    Frequency of Character

    create a method that will accept a word(String) and a letter (char) and return how many times that given letter is found in the given word

    Ex:
    Input:
        apple, p

    Output:
        2

    Ex:
    Input:
        apple, z

    Output:
        0

    Ex:
    Input:
        aabbaacca, a

    Output:
        5
 */
public class FrequencyOfCharacters {
    public static void main(String[] args) {

        String word = "apple";
        char letter = 'p';


        int num = frequencyOfCharacters(word, letter);
        System.out.println(num);

        System.out.println( frequencyOfCharacters("lOOpcamp", 'O'));

        System.out.println(StringUtil.frequencyOfCharacters("Wednesday", 'e'));
        System.out.println(StringUtil.uniqueCharacters("asddd"));

    }


    public static int frequencyOfCharacters (String word, char letter) {

        int count = 0;
        for (int i = 0; i < word.length(); i++) {

            if (word.charAt(i) == letter) {
                count++;
            }

        }

        return count;
    }
}