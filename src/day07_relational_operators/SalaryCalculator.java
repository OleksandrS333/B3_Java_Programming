package day07_relational_operators;

public class SalaryCalculator {

    public static void main (String [] args) {

        double salary = 100_000; // 100,000
        double stateTaxRate = 0.08; // 8%
        double federalTaxRate = 0.21; // 21%
        double stateTax, federalTax, totalTax, salaryAfterTax;


        stateTax = salary * stateTaxRate;
        federalTax = salary * federalTaxRate;
        totalTax = stateTax + federalTax;
        salaryAfterTax = salary - totalTax;


        String taxReport = "Tax Rate Info: \n\tState tax rate: " + stateTaxRate + "\n\tFederal tax rate: " + federalTaxRate + "\n\tSalary before tax: " + salary + "\nTax amount $" + stateTax + " is for state tax and tax amount $" + federalTax + " is for federal tax.\nAfter all these taxes, your total tax is $" + totalTax + " and your after tax salary is $" + salaryAfterTax;


        System.out.println(taxReport);

    }

}
