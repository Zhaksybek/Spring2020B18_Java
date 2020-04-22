package assigments.ArraysClassAssigments;
import java.util.Scanner;
public class Ar_114_UniqueElement {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(), input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};


        //String str = "AABCCDDEEL";
        String result = "";
        int count =0;

        for (int j=0; j < nums.length; j++) {

            count =0;
            for (int i = 0; i <nums.length; i++) {
                if ( nums[i]== nums[j]) {
                    count++;
                }
            }
            if (count == 1) {
               result += nums[j];
            }
        }//main loop
        System.out.println(result);






    }
}
