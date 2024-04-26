package day17_loops;

import java.util.Scanner;

public class GuessNumbers {

    public static void main(String[] args) {

        Scanner key = new Scanner (System.in);

        int secretNumber = 80;
        int userGuess;
        String attempt = "Attempt number: ";
        int attemptNum =0;
        do {
            System.out.println("Guess a number from 1 to 100: ");
            userGuess = key.nextInt();
            attemptNum++;
            System.out.println(attempt + attemptNum);
            if (userGuess > secretNumber) {
                System.out.println("Too high");
            } else if (userGuess < secretNumber) {
                System.out.println("Too low");
            } else {
                System.out.println("YES U DID IT");
            }
        }  while (userGuess != secretNumber);
    }
}
