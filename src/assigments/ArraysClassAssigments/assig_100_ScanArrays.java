package assigments.ArraysClassAssigments;

import java.util.Scanner;
public class assig_100_ScanArrays {

    public static void main(String[] args) {
        {
            Scanner input = new Scanner(System.in);
            String[] arr = new String[5];
            for (int i = 0; i < 5; i++) {
                arr[i] = input.nextLine();

            }
             //leave above alone!  write your code below.
            //Create another loop for your solution!



            for (int j =0; j<arr.length; j++   ){
                System.out.println(arr[j].substring(0,3));

            }












        }



        }
}
