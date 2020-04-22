package day18_nestedLoops;
import java.util.Scanner;
public class NestedLoop_Practice3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 while (true) {


     System.out.println("Enter two numbers");
     int num1 = input.nextInt();
     int num2 = input.nextInt();

     System.out.println("Addition of two numbers: " + (num1 + num2));
     System.out.println("Do you wanna continue");
     String answer = input.next();
     while (!(answer.equalsIgnoreCase("Yes") || answer.equalsIgnoreCase("No"))) {
         System.out.println("Invalid Entry, please enter yes or no");
         answer = input.next();
     }

     if (answer.equalsIgnoreCase("No")) {
         System.out.println("Thank you for using the calculator");
         break;

     }
 }//main while


        /*
        write program for room reservation:

        King Bed ==>120$
        Queen Bed =100$
        Sigle Bed = 80$

        Should ask which do you wanna reserve
            if user provides invalid entry ==> please re-enter

            calculate the total price

            do youy wanna reserve another room:
               if  yes==> repeat the previous steps
               if no ==> your total price is: $$$

               if answer either yes or no ==> pelease re-enter
         */








    }
}
