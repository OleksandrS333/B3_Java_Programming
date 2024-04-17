package day09_a_scanner;

import java.util.Scanner;

/*
    write a program for a rate calculator: RateCalculator
        1. asks the user to enter a  annual salary (double)
        2. asks the user how many hours he/she works in a week (as int)
        3. print the hourly rate (double) of the employee
            assume that one year has 52 weeks
            hourly rate = salary / (hours weekly * 52)
 */
public class RateCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("What is you annual/yearly salary? $");
        double salary = input.nextDouble();  // 120,000.00


        System.out.print("How many hours do you work in a week? ");
        int hoursInWeek = input.nextInt(); // 40

        double hourlyRate = salary / (hoursInWeek * 52);

        System.out.println("With the annual salary of " + salary + " and working for " + hoursInWeek + " hours in a week, you hourly rate is $" + hourlyRate);


    }

}