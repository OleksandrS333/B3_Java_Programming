package day05_variables;
/*
    create a class EmployeeInfo
    create a main method
    declare and assign these variables:
        first name, last name, gender, age, company name, are they full time, job title, salary, number of pto (0-25), are they married, suite(char - A, B, C, D)

    Print all the variables
 */
public class EmployeeInfo {
    public static void main (String [] args) {

//        String firstName;
//        String lastname;
//        String companyName;
//        String jobTitle;

        // As long as the variable share the SAME data type, we can declare them like this as well.
        String firstName, lastName, companyName, jobTitle;
        int age, pto; // Paid Time Off - day for vacation
        double salary;
        boolean isFullTime, isMarried;
        char suite, gender;

        firstName = "Feyruz";
        lastName = "Shahmurad";
        companyName = "Loopcamp";
        jobTitle = "Teacher";
        age = 37;
        pto = 21;
        salary = 120_000.00; // 120,000.00 - instead of comma we can use underscore
        isFullTime = true;
        isMarried = false;
        suite = 'A';
        gender = 'M';

        String fullDetail = "Employment Information for: "+ firstName + " " + lastName + "\n\tGender: \t\t" + gender + "\n\tJob Title: \t\t" + jobTitle;

        System.out.println(fullDetail);




    }

}
