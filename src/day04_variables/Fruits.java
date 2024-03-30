package day04_variables;

public class Fruits {
    public static void main (String [] args) {
        int apples = 80;
        int grapes = 100;
        int bananas = 150;

        System.out.println("This is how mane apples we have: " + 70);       // the value 70 is HARDCODED
        System.out.println("This is how mane apples we have: " + apples);   // the value of apple is DYNAMICALLY used
        System.out.println("Grapes: " +       grapes);
        System.out.println("Bananas: " +      bananas);



        // REASSIGNMENT EXPLANATION
        System.out.println("Sold out some of apples");
        apples = 30;  // I reassigned container called apple to have 30
        System.out.println("Apples after selling: " + apples);


        int price = 15;
        System.out.println("The price of my 30 apples is $15"); // IT IS HARDCODED
        System.out.println("The price of my " + apples + " apples is $" + price);




        // CONCATENATION EXPLANATION
        System.out.println();
        System.out.println(50 + 50);
        // NOTE: Anything after FIRST String is CONCATENATION
        System.out.println("50" + 50);
        System.out.println(10 + 10 + "10" + 10);  // 201010
    }
}
