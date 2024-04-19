package day14_string;

import java.util.Scanner;

/*
    Ask the user to enter a website
    check if it is a valid website

    - it is valid if it begins with:
        www.

    - it is valid if the end is:
        .com
        .edu
        .gov
        .net
        .io

      in cases it is not valid, tell the reason why

 */
public class Website {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please, enter a website: ");
        String url = input.next().toLowerCase(); // WWW.looPCamp.io --- > www.loopcamp.io

        boolean isValidStart = url.startsWith("www.");
        boolean isValidEnd = url.endsWith(".com") || url.endsWith(".edu") || url.endsWith(".gov") || url.endsWith("net") || url.endsWith(".io");



        if (isValidStart && isValidEnd) {
            System.out.println("It is a valid website.");

        } else {
            System.out.println("It is invalid website.");

            if (!isValidStart){
                System.out.println("It was invalid start");
            }

            if (!isValidEnd) {
                System.out.println("It was invalid end");
            }

        }

    }
}
