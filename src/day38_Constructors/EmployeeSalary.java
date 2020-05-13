package day38_Constructors;

public class EmployeeSalary {
    public static void main(String[] args) {
        SalaryCalculator zhaks =new SalaryCalculator(55,40,12.80/100,0.2);

        System.out.println(zhaks.salary());

        System.out.println(zhaks);

        System.out.println("============================================");
        SalaryCalculator malica =new SalaryCalculator(68,40,10.80/100,0.2);
        System.out.println(malica.salary());
        System.out.println(malica);




    }

}
