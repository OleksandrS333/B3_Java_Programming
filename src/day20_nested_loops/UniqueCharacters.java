package day20_nested_loops;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "AABCDDF";
        for (int i = 0; i <str.length(); i++) {
            char eachLetter = str.charAt(i);
            for (int j = 0; j < str.length(); j++) {
                char eachLetter2 = str.charAt(j);
            }
        }
    }
}
