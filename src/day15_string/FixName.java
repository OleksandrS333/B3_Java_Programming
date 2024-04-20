package day15_string;

/*
    first name
    last name

    fix to print proper name:
    capital first letter, the rest of the letter lowercase,  no extra space
 */

import java.util.Scanner;

public class FixName {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        String firstName = key.next().trim();
        System.out.print("Enter your last name: ");
        String lastName = key.next().trim();

        // ___TOM JerrY -- > Tom Jerry
        // TOm jerry -- > Tom Jerry

        String fixedFirstName =( ""+firstName.charAt(0) ).toUpperCase()  + firstName.substring(1).toLowerCase();  // TOM-- OM, MICKY -- > ICKY
        String fixedLastName = ("" + lastName.charAt(0) ).toUpperCase()  + lastName.substring(1).toLowerCase();

        System.out.println(fixedFirstName + " " + fixedLastName);


    }
}