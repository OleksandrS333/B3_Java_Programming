package Interview;

import java.util.Scanner;

public class InterviewKanan {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        double score;
        int attempt;

        System.out.println("Enter your score: ");
        score = key.nextDouble();

        System.out.println("Which attempt: ");
        attempt = key.nextInt();


        // each attempt reduce score by 10%

        if (attempt == 1) {
            score -= score*0.10;
            System.out.println("Your score after 1st attempt: " + score);
        } else if (attempt == 2){
            score -= score*0.20;
            System.out.println("Your score after 2d attempt: " + score);
        } else if (attempt == 3){
            score -= score*0.30;
            System.out.println("Your score after 3d attempt: " + score);
        } else  {
            System.out.println("Wrong input");
        }
    }

}
