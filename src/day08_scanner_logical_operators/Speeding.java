package day08_scanner_logical_operators;

/*
    create a class called Speeding, and write a program to determine if the car is speeding

            declare 3 variables:
            current speed, speed limit, speeding boolean

            print
            "Are you speeding? " true/false
 */
public class Speeding {
    public static void main (String [] args) {
        int currentSpeed = 28;
        int speedLimit = 25;
        // lets say you can go 3 MPH more than what is allowed

        boolean isSpeeding = currentSpeed > speedLimit+3; //

        System.out.println("Are you speeding? " + isSpeeding);


    }

}