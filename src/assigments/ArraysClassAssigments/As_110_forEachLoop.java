package assigments.ArraysClassAssigments;

import java.util.Scanner;
public class As_110_forEachLoop {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int count=0;
        for (int EachInteger: nums){
            if (EachInteger%2==0){
                count++;
            }
        }
        System.out.println(count);


    }
}
