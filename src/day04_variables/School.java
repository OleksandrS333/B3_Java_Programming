package day04_variables;
/*
    Task:

    class name: School

    declare and assign these variables
    number of students in grade 1
    number of students in grade 2
    number of students in grade 3
    number of students in grade 4
    number of students in grade 5

    total number of students in your school

    number of days in a year (have some half day = ~ 100.5)
    number of snow days in a year (double)
    average gpa in school (3.5) [ranges 1.0 - 4.0]

    print all of the variables with unique messages

*/
public class School {
    public static void main (String [] args) {
        int numberOfStudentsInGradeOne = 40;
        int numberOfStudentsInGradeTwo = 30;
        int numberOfStudentsInGradeThree = 38;
        int numberOfStudentsInGradeFour = 34;
        int numberOfStudentsInGradeFive = 27;

        int totalNumberOfStudents = numberOfStudentsInGradeOne + numberOfStudentsInGradeTwo + numberOfStudentsInGradeThree + numberOfStudentsInGradeFour + numberOfStudentsInGradeFive;
        System.out.print(totalNumberOfStudents);

        double numberOfSchoolDays = 100.5;
        double numberOfSnowDays = 5.5;
        double averageGpaInSchool = 3.6;

        System.out.println("Number of students in Grade 1: " + numberOfStudentsInGradeOne);
        System.out.println("Number of students in Grade 1: " + numberOfStudentsInGradeTwo);
        System.out.println("Number of students in Grade 1: " + numberOfStudentsInGradeThree);
        System.out.println("Number of students in Grade 1: " + numberOfStudentsInGradeFour);
        System.out.println("Number of students in Grade 1: " + numberOfStudentsInGradeFive);

        System.out.println("Total number of students: " + totalNumberOfStudents);

        System.out.println("Number of School days: " + numberOfSchoolDays);
        System.out.println("Number of Snow days: " + numberOfSnowDays);
        System.out.println("Average GPA in School: " + averageGpaInSchool);

    }
}
