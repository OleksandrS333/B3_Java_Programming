package day13_string;

public class UpperAndLower {
    public static void main(String[] args) {

        String str = "sNOw";

        System.out.println(str.toUpperCase());
        System.out.println(str);

        str = str.toUpperCase();  // we created COMPLETELY NEW STRING
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);

        System.out.println("------");
        System.out.println(str.toLowerCase());
        str = str.toLowerCase();
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);


        String word1 = "Loop";
        String word2 = word1 + "camp".toUpperCase(); // Loop + CAMP -- >  LoopCAMP
        System.out.println(word1.toUpperCase() + word2.toLowerCase());

        System.out.println(word1 + word2);


    }
}