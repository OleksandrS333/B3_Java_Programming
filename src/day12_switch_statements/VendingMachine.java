package day12_switch_statements;

import java.util.Scanner;

public class VendingMachine {

    public static void main(String[] args) {


        Scanner key = new Scanner(System.in);
        System.out.println("welcome to the Vending machine.");
        System.out.println("Please, select on of the following: \n\tDrinks\n\tSnacks\n\tGums");
        System.out.println("\n\tSelect:");
        String item = key.next();

        switch (item) {
            case "Drinks":
                System.out.println("You've selected Drinks.\nChoose your drinks by pressing number: \n\t1 - Water\n\t2 - Soda\n\t3 - Juice");
                int drink = key.nextInt();

                if (drink == 1) {
                    item = "Water";

                } else if (drink == 2) {
                    System.out.println("Soda");
                } else if (drink == 3) {
                    System.out.println("Juice");

                } else {
                    System.out.println("Invalid number");
                }
                break;

            case "Snacks":
                System.out.println("You've selected Snacks.\nChoose your snacks by pressing number: \n\t1 - Chips\n\t2 - Cookies\n\t3 - Candies");
                int snack = key.nextInt();

                if (snack == 1) {
                    item = "Chips";

                } else if (snack == 2) {
                    System.out.println("Cookies");
                } else if (snack == 3) {
                    System.out.println("Candies");

                } else {
                    System.out.println("Invalid number");
                }
                break;
            case "Gums":
                System.out.println("You've selected Gums.\nChoose your snacks by pressing number: \n\t1 - Mentos\n\t2 - D&R\n\t3 - Hooba");
                int gum = key.nextInt();

                if (gum == 1) {
                    item = "Mentos";

                } else if (gum == 2) {
                    System.out.println("D&R");
                } else if (gum == 3) {
                    System.out.println("Hooba");

                } else {
                    System.out.println("Invalid number");
                }
                break;
            default:
                System.out.println("Wrong");

        }

    }


}
