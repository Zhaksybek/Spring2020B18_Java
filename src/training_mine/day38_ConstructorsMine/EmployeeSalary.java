package training_mine.day38_ConstructorsMine;

import java.util.Arrays;

public class EmployeeSalary {
    public static void main(String[] args) {

        SalaryCalculator jack = new SalaryCalculator(67,40,8.25/100,0.2);
        System.out.println(jack.salary());
        System.out.println(jack.salaryAfterTax());

        System.out.println("================");

        System.out.println(jack);

        //Arrays.sort();



    }
}
