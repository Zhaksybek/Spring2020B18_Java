package assigments.ArrayList_REP;

import java.util.ArrayList;

public class tmesTwo {
    public static void main(String[] args) {
        ArrayList<Integer> list =  new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(3);
        list.add(7);

        System.out.println(twoTimes(list));
    }

    public static ArrayList<Integer> twoTimes(ArrayList<Integer> nums){
        ArrayList<Integer> nums2 = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i=0; i<nums.size();i++){
            nums2.add(nums.get(i));
        }

        for (int i=0;i<nums.size();i++){
            result.add(nums.get(i));
            result.add(nums2.get(i));
        }
        return result;

    }

}
