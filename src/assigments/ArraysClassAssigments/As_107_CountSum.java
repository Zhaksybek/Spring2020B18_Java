package assigments.ArraysClassAssigments;
import java.util.Arrays;
import java.util.Scanner;
public class As_107_CountSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt(),input.nextInt()};

        int sum=0;

        for (int i=0; i<nums.length; i++){
            if (nums[i]%2==0) {
                sum += 1;
            }
        }
        System.out.println(sum);

    }
}
