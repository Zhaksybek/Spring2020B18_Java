package day20_Arrays_Continue;

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "June", "July","Aug", "Sep", "Oct", "Nov", "Dec"};
       // String[] months2 = new String[12];


        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");

        int num= input.nextInt();

        int attemts = 1;

        while (num>12 || num <= 0){
            System.out.println("Invalid entry");
            System.out.println("Please re enter the number");
            num = input.nextInt();
            attemts++;

         if (attemts == 3 && (num > 12 || num<=0)){
             System.out.println("Invalid Entry, you already have 3 attemts");
             System.exit(0);
         }

        }

        String result=  months[num-1];

        System.out.println(result);



    }
}
