package day03_VariablesContinue;

public class SalaryCalculator {
    public static void main(String[] args) {

        double HourlyRate = 65;
        double stateTaxRate = 0.04;
        double federalTaxRate = 0.22;
        byte weeklyHours = 45;
        byte totalWeeks = 48;

        //salary = hourlyRate * weeklyHours * 52
        double salary = HourlyRate * weeklyHours * totalWeeks;
                  // salary before tax

        //state tax = salary * stateTaxRate

        double stateTax = salary * stateTaxRate;

        //federalTax = salary * federalTaxRate
        double federalTax = salary * federalTaxRate;

        //salaryAfterTax = salary - stateTax - federalTax;

        double salaryAfterTax = salary - (stateTax + federalTax);


        System.out.println("Your salary is: $" + salary);
        System.out.println("Your federal tax is: $" + federalTax);
        System.out.println("Your state tax is: $" + stateTax);
        System.out.println("Your total tax is: $" + (stateTax + federalTax));
        System.out.println("Salary after tax is: $" + salaryAfterTax);


    }
}
