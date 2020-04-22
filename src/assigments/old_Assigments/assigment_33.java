package assigments.old_Assigments;

import java.util.Scanner;

public class assigment_33 {
    public static void main(String[] args) {

        //int newseniorCitizens,

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
        int seniorCitizens = scan.nextInt();
        int nonSeniorCitizen = scan.nextInt();

        System.out.println("What is new citizen's age?");
        int age = scan.nextInt();

        int newseniorCitizens =0;
        int newnonSeniorCitizen =0;

        if (age>=65){
             System.out.println( "Senior Citizen" );
            newseniorCitizens = ++seniorCitizens;
            System.out.println("New seniorCitizens count " +newseniorCitizens );
            System.out.println("New nonSeniorCitizens count " + nonSeniorCitizen);
         }else {
            System.out.println("Non-Senior Citizen");
            newnonSeniorCitizen = ++nonSeniorCitizen;
            System.out.println("New seniorCitizens count "+seniorCitizens);
            System.out.println("New nonSeniorCitizens count " + nonSeniorCitizen);


         }
            //System.out.println("New seniorCitizens count " +newseniorCitizens );
            //System.out.println("New nonSeniorCitizens count " + ++nonSeniorCitizen);











    }
}
