package day08_scanner_logical_operators;

public class Store {
    public static void main (String [] args) {

        String store = "Target";
        int numOfTv = 100;


        System.out.println("In the " + store + " store, there are " + numOfTv + " TVs.");
        System.out.println("Someone comes into store and purchased 1 TV");
        //numOfTv = numOfTv - 1;
        //numOfTv--;
        //--numOfTv;
        //numOfTv -= 1;

        System.out.println("Now, in store we have " + --numOfTv + " TVs.");

        System.out.println("Another person comes into store and purchased 1 TV");
        System.out.println("Now, in store we have " + --numOfTv + " TVs.");


        System.out.println("Another person came in and put the 1 TV into the shopping cart.");
        System.out.println("Now, in the store we have " + numOfTv-- + " TVs ");


    }
}