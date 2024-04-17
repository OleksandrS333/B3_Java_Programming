package day09_a_scanner;

import java.util.Scanner;

/*
    Task

    create Scanner object
    ask the user to enter their first name - next
    ask the user to enter their last name - next
    ask the user if they are employed - boolean
    ask the user if they are a student - boolean

 */
public class WorkStatus {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = input.next();

        System.out.print("Enter your last name: ");
        String lastName = input.next();

        System.out.print("Are you employed? [true/false] ");
        boolean isEmployed = input.nextBoolean();

        System.out.print("Are you student? [true/false] " );
        boolean isStudent = input.nextBoolean();

        String personInfo = firstName + " " + lastName + " information: \n\tIs employed: " + isEmployed + "\n\tIs a student: " + isStudent;

        System.out.println(personInfo);




    }

}