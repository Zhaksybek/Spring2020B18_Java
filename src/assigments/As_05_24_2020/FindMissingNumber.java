package assigments.As_05_24_2020;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FindMissingNumber {

        public static void main(String[] args) {
            int[] arr ={1, 2, 3, 4, 5,6, 7,8,  9, 10}; //11
            Arrays.sort(arr);

            int sum =0;
            for (int i=0; i<arr.length;i++){
                sum+=arr[i];
            }
            System.out.println(sum);

            int sum1 =0;
            for (int j=arr[0]; j<=arr.length+1;j++){
                sum1 += j;
                System.out.print(j+" ");
            }
            System.out.println();
            System.out.println(sum1);
            System.out.println(sum1-sum);









        }

        public static int missingNumber(int[] arr){
            Arrays.sort(arr);

            int sum =0;
            for (int i=0; i<arr.length;i++){
                sum+=arr[i];
            }
            int sum1 =0;
            for (int j=arr[0]; j<=arr.length+1;j++){
                sum1 += j;

            }
            if (sum1-sum==0){
                return 0;
            }else {
            return sum1-sum;
            }


        }


}
