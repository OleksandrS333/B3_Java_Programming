package day18_loops;

import java.util.Scanner;

public class SwitchInLoop {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int num = key.nextInt();

        for (int i = 0; i <num; i++) {

            System.out.println("========");
            switch (i) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
            }
        }


    }
}
