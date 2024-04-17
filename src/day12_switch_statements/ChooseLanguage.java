package day12_switch_statements;

import java.util.Scanner;

/*
        ask the user to enter a number based on the language they wanted to use.
        1 - English
        2 - Spanish
        3 - Turkish
        4 - Russian
        5 - French
        6 - Azerbaijan

    based on the number they picked print a message:

        1 : "hello, thanks for your call"
        2 : "hola, gracias para llamar"
        3 : "merhaba, aradiginiz icin tesekkurler"
        4 : "privet, spasibo za vash zvonok"
        5 : "Merci ,pour votre appel"
        6 : "salam, zeng ettiginiz ucun mennatdariq"
        any other number: "We will use English by default"
 */
public class ChooseLanguage {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Please, enter a language by the number from options below: \n\t1 - English\n\t2 - Spanish\n\t3 - Turkish\n\t4 - Russian\n\t5 - French\n\t6 - Azerbaijan\n\n\tChoose an option: ");
        int userOption = key.nextInt(); //

        if (userOption == 1) {
            System.out.println("\n\thello, thanks for your call");
        } else if (userOption == 2) {
            System.out.println("\n\thola, gracias para llamar");
        } else if (userOption == 3)  {
            System.out.println("\n\tmerhaba, aradiginiz icin tesekkurler");
        } else if (userOption == 4) {
            System.out.println("\n\tprivet, spasibo za vash zvonok");
        } else if (userOption == 5) {
            System.out.println("\n\tMerci ,pour votre appel");
        } else if (userOption == 6) {
            System.out.println("\n\tsalam, zeng ettiginiz ucun mennatdariq");
        }


    }
}