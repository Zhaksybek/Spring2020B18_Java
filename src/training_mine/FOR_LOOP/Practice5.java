package training_mine.FOR_LOOP;

import java.util.Scanner;

public class Practice5 {
    public static void main(String[] args) {

       //FIND MIN NUM

        Scanner scan = new Scanner(System.in);
        int min =999999999; // store the min user input value


        for (int i=0; i<=5; i++) {
            System.out.println("Enter a"  + " number");
            int inputNum = scan.nextInt();  // 1, -2
            if (inputNum < min){
                min = inputNum;

            }//if min
        }
        System.out.println("Min num is: "+min);


        System.out.println("====================================");

        for (int j=1; j<5;){
            System.out.println(j+" ");
            j++;
        }



    }
}
