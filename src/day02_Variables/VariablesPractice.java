package day02_Variables;

public class VariablesPractice {
    public static void main(String[] args) {

        /* salary, federal tax,state tax rate, loan, ssn */

        int salary = 120000;
        double federalTax = 0.18;
        float stateTax = 0.065f;

        // salary after tax = salary(1-sum of taxes)
        double sumTaxes = federalTax + stateTax;
        double salaryafterTax = salary * (1-sumTaxes);

        System.out.println(salaryafterTax);

        System.out.println("===================================================");

        // area of the circle = r * r * pi
        float pi = 3.14f;
        double r = 5.5;
        double area = r * r * pi;
        System.out.println(area);


        System.out.println("===================================================");
        int kg = 90;
        double pound = kg * 2.25;
        System.out.println(pound);

        System.out.println("===================================================");

        double tenge = 500000;
        double tengeindollar = tenge / 385;
        System.out.println(tengeindollar);

        System.out.println("===================================================");
        double liter = 1000;
        double galons = liter / 3.7;

        System.out.println(galons);

    }
}
