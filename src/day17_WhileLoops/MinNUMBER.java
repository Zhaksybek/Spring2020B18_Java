package day17_WhileLoops;
import java.util.Scanner;
public class MinNUMBER {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        int MinNumber = 2147483647;  // any number the user provided will be greater than this number
        // first user entered variable will be initalized to MaxNumber
        //MaxNumber = 5;

        for(int i =1; i <= 5; i++) { // i: 1, 2, 3,4,5
            System.out.println("Enter a number");
            int num = input.nextInt();  // 0, 5, 1, 3, 0

            if(num < MinNumber){  // to compare each user inputs , and assign the maximum number to MaxNumber
                MinNumber = num;
            }

        }


        System.out.println(MinNumber);

    }
}
