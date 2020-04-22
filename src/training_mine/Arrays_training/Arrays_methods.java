package training_mine.Arrays_training;

import java.util.Arrays;
import java.util.jar.Attributes;

public class Arrays_methods {
    public static void main(String[] args) {

        int num1 = 10;
        System.out.println(num1);

        int[] arr = {1,2,3};
        System.out.println(Arrays.toString(arr));

        String[] names = {"Madina", "Aiaru", "Elsa", "Aiko", "Togjana"};

        System.out.println(names[1]);
        System.out.println(Arrays.toString(names)); //toString method

        /*
        Sort method
        Arrays.sort(variableName):
                    sort the values of the array in acsending order (smallest)
         */
        System.out.println("==================================");

        int[]  Numbers ={9, 8, 100, 3000, 4, 5, 6};
        Arrays.sort(Numbers);

        System.out.println(Arrays.toString(Numbers));
        System.out.println("Max number is: "+Numbers[Numbers.length-1]);

        System.out.println("Min number is: "+Numbers[0]);

        System.out.println();
        String[] nameList = {"Monica", "Belluchi", "Dicaprio", "Leonardo", "ABC", "ABD"};
               Arrays.sort(nameList); // sorted by AsCII table
        System.out.println(Arrays.toString(nameList));


        String str="Satylgan Zhaksybek Quanyshuly";

        char[] ch = str.toCharArray();

        System.out.println(Arrays.toString(ch));


        System.out.println("====================================================");


        int[] nums = {200, 90, 89, 78, 65, 5555, 444, -5};

        Arrays.sort(nums);

        System.out.println(Arrays.toString(nums));

        System.out.println("Max number is: "+ nums[nums.length-1]);
        System.out.println("Min number is: "+ nums[0]);
        System.out.println("Second min number is: "+nums[1]);














    }
}
