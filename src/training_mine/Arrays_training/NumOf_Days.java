package training_mine.Arrays_training;

import java.util.Scanner;

public class NumOf_Days {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
     String[] days ={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};// size: 7, MaxIndex 6

        System.out.println("Enter your number: ");
        int numDay = scan.nextInt();
        String result ="";

        int count =1;

        while (numDay<1 || numDay>7){
            System.out.println("Invalid number");
            System.out.println("Please re-enter");
            numDay = scan.nextInt();
            count++;
            if (count==3 && (numDay<1 || numDay>7)){
                System.out.println("");
                System.out.println("Your attepmts is done");
            System.exit(0);
            }


        }
            result =days[numDay-1];
        System.out.println("Today is: "+result);







    }
}
