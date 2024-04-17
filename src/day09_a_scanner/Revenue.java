package day09_a_scanner;

import java.util.Scanner;

public class Revenue {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the price of the item: ");
        double price = keyboard.nextDouble();

        System.out.print("Enter the quantity of the item: ");
        int quantity = keyboard.nextInt();

        double revenue = price * quantity;
        System.out.print("The revenue is $" + revenue);

    }

}
