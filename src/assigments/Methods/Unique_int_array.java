package assigments.Methods;
import java.util.Arrays;
import java.util.Scanner;
public class Unique_int_array {

    public static void main(String[] args) {
       int[] nums = {2,5,5,6,3,6,9,34,3};

        for (int j=0; j < nums.length; j++) {

            int count =0;
            for (int i = 0; i <nums.length; i++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 1) {

                System.out.println(  nums[j]  );
            }

        }



     printUniqueNumbers(nums);
    }

    public static void printUniqueNumbers(int[] nums){
        //WRITE YOUR CODE HERE

        for (int j=0; j < nums.length; j++) {

            int count =0;
            for (int i = 0; i <nums.length; i++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 1) {

                System.out.println(  nums[j]  );
            }

        }


    }

}
