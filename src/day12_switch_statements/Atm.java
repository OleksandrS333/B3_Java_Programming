package day12_switch_statements;

import java.util.Scanner;

public class Atm {
    public static void main (String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("*** WELCOME to ATM ***\n\nPlease, insert your card.\nThen type your pincode: ");
        int userInputPin = input.nextInt();

        int expectedPin = 6789;
        double balance = 1_000_000.00;

        //OUTER IF - PARENT IF
        if(userInputPin == expectedPin) {

            System.out.println("\nYou are logged in");
            System.out.println("Select a number for your need:");
            System.out.println("\t1 - Check Balance");
            System.out.println("\t2 - Withdraw");
            System.out.println("\t3 - Deposit");
            System.out.print("\nYour choice: ");

            int option = input.nextInt();
            // INNER IF - CHILD IF - NESTED IF
            if (option == 1) {
                System.out.println("Your balance is $" + balance);
            } else if (option == 2) {
                System.out.print("how much do you want to withdraw? $");
                double withdrawAmount = input.nextDouble();
                System.out.println("Stand By... Withdrawing $" + withdrawAmount);
                balance -= withdrawAmount; // balance  = balance - withdrawAmount;
                System.out.println("After withdraw, you balance is $" + balance);
            } else if (option == 3) {
                System.out.print("Please, insert the money: $");
                double deposit = input.nextDouble();
                balance += deposit;  // balance = balance + deposit;
                System.out.println("After deposit, you balance is $" + balance);
            } else {
                System.out.println("Invalid selection. Exiting the account");
            }

        } else {
            System.out.println("Invalid pincode. Come back tomorrow.");
        }


    }
}