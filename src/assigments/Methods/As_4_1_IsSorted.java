package assigments.Methods;

import java.util.Arrays;

public class As_4_1_IsSorted {
    public static void main(String[] args) {
       int[] nums= {2,3,5,4,9};

       int[] arr =new int[nums.length];

       for (int i=0;i<nums.length;i++){
           arr[i] = nums[i];
       }
       Arrays.sort(arr);

        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(arr));






    }

    public static boolean isSort(int[] nums)
    {
        int[] arr =new int[nums.length];

        for (int i=0;i<nums.length;i++){
            arr[i] = nums[i];
        }
        Arrays.sort(arr);
        if (Arrays.equals(nums,arr)){
            return true;
        }else {
            return  false;
        }


       /*

        int[] arr =new int[nums.length];
              arr=nums;
        Arrays.sort(nums);

        if (Arrays.equals(nums,)){
            return true;
        }else{
            return false;
        }*/


    }

}
