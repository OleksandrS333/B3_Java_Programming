package day18_loops;
/*
Syllables
    Given a String separated by dashes calculate how many syllables the words are
    Ex:
        Input:
            ja-va
        Output:
            2
 */
public class Syllables {
    public static void main(String[] args) {
        String str = "ja-va-script";
        int countDash = 1;

        for (int index = 0; index < str.length(); index++){

            if (str.charAt(index) == '-'){
                countDash++;
            }
        }
        System.out.println("Number of syllables: " + (countDash));

    }

}