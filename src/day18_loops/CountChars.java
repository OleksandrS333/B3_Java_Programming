package day18_loops;

/*
    Count upper, lower, and numbers
        Given a String, find and print how many uppercase letter, lowercase letter, and number are in the String.
        Ex:
        Input: 2juMp41EEkd4s4

        Output:
        3 uppercase letters
        6 lowercase letters
        5 numbers
 */
public class CountChars {
    public static void main(String[] args) {
        String str = "2juMp41EEkd4_s4";
        int upperCount = 0;
        int lowerCount = 0;
        int numCount = 0;
        int others = 0;

        for (int i = 0; i < str.length(); i++) {

            char eachLetter = str.charAt(i);

            if (eachLetter >= 'A' && eachLetter <= 'Z'){
                upperCount++;
            } else if (eachLetter >= 'a' && eachLetter <= 'z'){
                lowerCount++;
            } else if(eachLetter >= '0' && eachLetter <= '9'){  // 0 is different than '0'
                numCount++;
            } else {
                others++;
            }

        }

        System.out.println("Uppercase letter count: " + upperCount);
        System.out.println("Lowercase letter count: " + lowerCount);
        System.out.println("Number letter count: " + numCount);
        System.out.println("Other letter count: " + others);


    }
}
