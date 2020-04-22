package day12_JavaRecap;
import java.util.Scanner;
public class SalaryCalculator {
    public static void main(String[] args) {


        /*
        ask salary
        ask full name
        ask company name
        Ask SSN
        ask Job Title
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your salary:");
        double salary = scan.nextDouble();

        scan.nextLine(); //before use NextLine

        System.out.println("Enter your full name");
        String fullName = scan.nextLine();


        System.out.println("Enter your company name:");
        String compName = scan.nextLine();

        System.out.println("Enter your SSN:");
        String ssn = scan.nextLine();


        //scan.nextLine();
        System.out.println("Enter your job title");
        String jobTitle = scan.nextLine();
       


        System.out.println("Full name: "+fullName);
        System.out.println("Job title: "+jobTitle);
        System.out.println("Company name: "+compName);
        System.out.println("SSN "+ssn);
        System.out.println("Salary is: "+salary);









    }
}
