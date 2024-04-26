package day17_loops;

import java.util.Scanner;
/*
    repeated actions
        -ask the user to enter the item
        -add item to the shopping list
        -ask user if they want to add more items.

    At the end show the whole item list
 */

public class ShoppingList {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        String list = "Shopping List:";
        String userAnswer;

        do{
            System.out.println("Please, enter the name of the item: ");
            String userItem = key.nextLine();
            list = list + "\n\t" + userItem;

            System.out.println("Do you want to add more item? ");
            userAnswer = key.nextLine(); // YES, yes, Y, y

        } while (userAnswer.equalsIgnoreCase("yes") || userAnswer.equalsIgnoreCase("y"));
        // If the user types anything besides the "yes", "YES" or "y", "Y", the loop will stop the execution.
        // The loop will continue the ITERATION / cycling as long as user enters "YES", "yes", "Yes" or "y", "Y"

        System.out.println(list);






    }
}