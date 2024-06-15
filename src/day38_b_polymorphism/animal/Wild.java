package day38_b_polymorphism.animal;

public class Wild {
    public static void main(String[] args) {

        //#1 -  all possible reference / object - Lizard
        //Reference - Itself
        Lizard l1 = new Lizard();
        l1.eat();
        l1.name = "Lizard";
        l1.numOfLegs = 10;
        l1.skinColor = "Camo";
        System.out.println(l1.name);
        System.out.println(l1.numOfLegs);
        System.out.println(l1.skinColor);
        System.out.println();

        // the reference side DETERMINES the accessibility
        // reaches the eat() from parent but run the version from object
        // if child does not have overriden version of eat(), then it will run the one from parent

        // Reference - Parent
        Reptile l2 = new Lizard();
        l2.eat();
        l2.name = "Lizzard2";
        l2.numOfLegs = 12;
        //l2.skinColor = "Camo2"; // Reptile reference does not have access to skinColor var.
        System.out.println(l2.name);
        System.out.println(l2.numOfLegs);
        //System.out.println(l2.skinColor); // Reptile reference does not have access to skinColor var.
        System.out.println();



        // Reference - Grand Parent
        Animal l3 = new Lizard();
        l3.eat();
        l3.name = "Lizzard3";
        //l3.numOfLegs = 14; // Animal reference does not have access to numOfLegs var
        //l2.skinColor = "Camo3"; // Reptile reference does not have access to skinColor var.
        System.out.println(l3.name);
        //System.out.println(l3.numOfLegs);  // Animal reference does not have access to numOfLegs var
        //System.out.println(l3.skinColor); // Reptile reference does not have access to skinColor var.
        System.out.println();


        /**
         * We created 3 objects of Lizzard
         *  1 - Reference was ITSELF - Lizzard
         *  2 - Reference was Parent class - Reptile
         *  3 - Reference was GRAN Parent class - Animal
         */


        // #2 - -  all possible reference / object - Reptile
        // Reference Itself - Reptile
        // Reference Parent - Animal
        // Animal r1 = new Reptile();
        // r1.numOfLegs = 20;






    }
}
