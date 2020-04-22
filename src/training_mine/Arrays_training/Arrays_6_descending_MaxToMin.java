package training_mine.Arrays_training;

import java.util.Arrays;

public class Arrays_6_descending_MaxToMin {
    public static void main(String[] args) {

        int[] MyNumbers ={111,999,-8, 6, 4, 85,  233,-666,888,45,  2,  5,   0, 555};
        //                 0    1  2  3  4   5     6   7   8   9  10   11  12  13
        Arrays.sort(MyNumbers);
        System.out.println(Arrays.toString(MyNumbers));

        String result = "[";

        for (int i=MyNumbers.length-1; i >=0; i-- ){

            result += MyNumbers[i]+", ";

        }

        result = result.substring(0,result.length()-2)+"]";
        System.out.println(result);

        System.out.println("===============================================");

        int[] arr2 = {99,5,5,8,7,444,666,88,59,4,60,6};
        Arrays.sort(arr2);

        int[] arr3 = new int[arr2.length];
        int z=0;
        for (int i=arr2.length-1; i>=0; i--){
            arr3[z] = arr2[i];
            z++; // int z =0; and z++  its for arr2
        }
        System.out.println("Assending order: "+Arrays.toString(arr2));
        System.out.println("Descending order: "+Arrays.toString(arr3));



    }
}
