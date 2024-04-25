package day16_loops;

import java.util.Scanner;

/*
    [Move first word]
        Given a sentence. Display the sentence with the first word moved to the end of the sentence.
        Ex:
        Input: Java is a fun language
        Output: is a fun language Java
        Hint: Use indexOf and substring
 */
public class MoveFirstWord {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter a sentence: ");
        String sentence = key.nextLine().trim(); // Java is a fun language

        // Take the part from sentence  - > .substring(0, indexOfFirstSpace)
        //                      How do I get indexOfFirstSpace - > .indexOf(" ");


        //int indexOfFirstSpace = sentence.indexOf(" ");
        //String firstWord = sentence.substring(0,  indexOfFirstSpace);

        String firstWord = sentence.substring(0,  sentence.indexOf(" "));

        //String restOfSentence = sentence.substring ( sentence.indexOf(" ")).trim();  // is a fun language

        String restOfSentence = sentence.substring ( sentence.indexOf(" ") + 1 );



        System.out.println(restOfSentence + " " +firstWord); // Java is a fun language Java






    }
}