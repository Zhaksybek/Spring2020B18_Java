package training_mine.Old_training;
import java.util.Scanner;
/*
 ask salary
        ask full name
        ask company name
        Ask SSN
        ask Job Title
 */
public class salary_mine {
    public static void main(String[] args) {

     Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name");

        String fullName = scan.nextLine();

        System.out.println("Enter your company name");
        String companyName = scan.nextLine();

        System.out.println("Enter your SSN");
        int ssn = scan.nextInt();

        scan.nextLine();// for enter
        System.out.println("Enter your job title");
        String jobTitle = scan.nextLine();


        System.out.println("Your full name is: "+fullName);
        System.out.println("Your company name is: "+companyName);
        System.out.println("Your SSN is: "+ssn);
        System.out.println("Your job title is: "+jobTitle);






    }
}
