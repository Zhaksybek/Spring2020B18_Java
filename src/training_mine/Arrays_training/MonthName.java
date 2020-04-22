package training_mine.Arrays_training;

import java.util.Scanner;

public class MonthName {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "June", "July","Aug", "Sep", "Oct", "Nov", "Dec"};

        System.out.println("Enter your number");
        int numOfMonth = scan.nextInt();

        int count =1;
        while (numOfMonth>12 || numOfMonth<1){
            System.out.println("Invalid Entry");
            System.out.println("please re enter the number");
            numOfMonth = scan.nextInt();
            count++;
            if (count==3 && (numOfMonth>12 || numOfMonth<1) ){
                System.out.println("Invalid number. your 3 attempt is done!");
                System.exit(0);
            }

         }

            String result = months[numOfMonth-1];
             System.out.println(result);








    }
}
