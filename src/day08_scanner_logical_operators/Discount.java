package day08_scanner_logical_operators;
/*
    Task
        declare and assign
            is it the weekend
            are you a teacher
            are you a police officer
            are you a firefighter

         Do you get a discount?
            Must be a weekend and you must be one of the given professions
 */
public class Discount {
    public static void main(String[] args) {

        boolean isWeekend = false;
        boolean isTeacher = false;
        boolean isOfficer = true;
        boolean isFirefighter = false;

        boolean isEligibleForDiscount = isWeekend && isTeacher || isOfficer || isFirefighter;
        //                                                false  ||  true     || false
        //                                                      true          || false
        //                                                                  true
        //                                 true  &&   true
        //                                      true

        System.out.println("It is eligible: " + isEligibleForDiscount);



    }
}