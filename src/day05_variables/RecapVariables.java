package day05_variables;

/*
    Variable Naming Recap:

        hell1@ - can not have any special characters other than $ _ digit
        12test - Cannot start with numbers
        $public - we can start with $
        _34hello - we can start with _
        staticTest - valid
        static - not valid. It is java reserved word
        Package - valid because it starts with capital P however not recommended because not following camelCase pattern
 */
public class RecapVariables {

    public static void main (String [] args) {

        // Declare variables
        byte numberOfCoffeeCups;
        double totalPriceOfCoffee;
        int totalNumberOfStudentsInClass;

//        // We can't use the variables because they do NOT have a VALUE yet
//        System.out.println(numberOfCoffeeCups);
//        System.out.println(totalPriceOfCoffee);
//        System.out.println(totalNumberOfStudentsInClass);

        // Assign values
        numberOfCoffeeCups = 2;
        totalPriceOfCoffee = 10.25;
        totalNumberOfStudentsInClass = 100;


        System.out.println(numberOfCoffeeCups);
        System.out.println(totalPriceOfCoffee);
        System.out.println(totalNumberOfStudentsInClass);


        // print out like this: numberOfCoffeeCups * totalNumberOfStudentsInClass
        // we used concatenation to print out the values of two variables in a given format above
        System.out.println( numberOfCoffeeCups + " * " + totalNumberOfStudentsInClass);
    }
}
