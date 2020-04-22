package assigments.ArraysClassAssigments;

import java.util.Scanner;

public class assig_101 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};



        for (int i=0; i<nums.length; i++){

           if (nums[i]==5 && nums[i+1]==5 ){
               System.out.println(true);
           }

           if (!(nums[i]==5) && !(nums[i]==nums[i+1]) ){
               System.out.println(false);
               System.exit(0);
           }

       }

        //while ()




    }
}
