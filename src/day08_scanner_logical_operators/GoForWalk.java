package day08_scanner_logical_operators;
/*
     Want to go for a walk
     We will go for a walk
           if it is not raining
           and the weather is above 70

 */
public class GoForWalk {
    public static void main(String[] args) {

        boolean isRaining  = false;
        int temperature  = 80;

        System.out.println("Go for a walk: " +  (!isRaining && temperature > 70 )  );


    }
}