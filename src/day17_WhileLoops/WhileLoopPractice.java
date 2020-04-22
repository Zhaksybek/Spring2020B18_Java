package day17_WhileLoops;

import java.util.Scanner;

public class WhileLoopPractice {
    public static void main(String[] args) {

          /*
        ask the user to enter yes or no.
          if the user other than yes or no, repeat the previous step
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Yes or No");
                     String word=    scan.next();

        boolean valid =word.equalsIgnoreCase("Yes") ||word.equalsIgnoreCase("No");

        while (!valid){
            System.out.println("Please re-enter");
             word=    scan.next();

             if (word.equalsIgnoreCase("Yes") ||word.equalsIgnoreCase("No")){
                 break;
             }

        }

        if (word.equalsIgnoreCase("Yes")){
            System.out.println("Entered Yes");
        }

        if (word.equalsIgnoreCase("No")){
            System.out.println("Entered No");
        }

    }
}
