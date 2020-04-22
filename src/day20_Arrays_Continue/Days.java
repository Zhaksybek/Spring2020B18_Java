package day20_Arrays_Continue;

import java.util.Scanner;

public class Days {
    public static void main(String[] args) {

        String[] days ={"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};// size: 7, MaxIndex 6

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a number");

         int num = scan.nextInt();//6

        int count= 1;

        while (num>7  || num<1){
            System.out.println("Invalid Entry, please re enter the number");
            num = scan.nextInt();
            count++;

            if (count==3 && (num>7  || num<1) ){
                System.out.println("Invalid entry");
                System.exit(0);
            }
        }

              String result = days[num-1];

        System.out.println(result);


    }
}
