package assigments.ArrayList_REP;

import java.util.ArrayList;

public class As_192 {
    public static void main(String[] args) {

        ArrayList<Integer> nums =new ArrayList<>();
        nums.add(7);
        nums.add(6);
        nums.add(2);
        nums.add(4);
        nums.add(9);
        nums.add(7);

        ArrayList<Integer> result =new ArrayList<>();


        for (int i=0;i<nums.size();i++){
            result.add(nums.get(i)*2);
        }

        System.out.println(nums);
        System.out.println(result);
        System.out.println("===========================================");

       timesTwo(nums);

    }

    public static void timesTwo(ArrayList<Integer> nums){
        ArrayList<Integer> result =new ArrayList<>();


        for (int i=0;i<nums.size();i++){
            result.add(nums.get(i)*2);
        }

        System.out.println(nums);
        System.out.println(result);

    }





}
