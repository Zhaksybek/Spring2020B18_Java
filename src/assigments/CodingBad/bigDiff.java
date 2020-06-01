package assigments.CodingBad;

import java.lang.reflect.Array;
import java.util.Arrays;

public class bigDiff {
    public static void main(String[] args) {
        /*no14([1, 2, 3]) → true
        no14([1, 2, 3, 4]) → false
        no14([2, 3, 4]) → true
    Given an array of ints, return true if it contains no 1's or it contains no 4's.
         */
        int[] nums = {1, 2, 3};

        int count1=0;
        int count4=0;
        for (int i=0; i<nums.length;i++){
            if (nums[i]==1){
                count1++;
            }else if (nums[i]==4){
                count4++;
            }
        }
        if (count1>0 && count4>0){
            System.out.println(false);
        }else {
            System.out.println(true);
        }



    }
}
