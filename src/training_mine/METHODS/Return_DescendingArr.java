package training_mine.METHODS;

import java.util.Arrays;

public class Return_DescendingArr {
    public static void main(String[] args) {





    }//main


    //Descending array
    public static int[] Descendin(int[] arr){ // if u wanna take array int[]; (else just int ) ==>after  public static

        /*
         int[] array= {77,66,50,37,-9,82,0,7,3,-3,4,100,8777,0};

    int[] DescResult = Descendin(array);
        System.out.println(Arrays.toString(DescResult));
         */


        Arrays.sort(arr);
        int[] newArr = new int[arr.length];
        /*
        newArr[0]  = arr[i]   i means arr.length-1;
         */

        int j=0;
        for (int i=arr.length-1; i>=0;i--){
            newArr[j] = arr[i];
            j++;
        }
    return newArr;
    }





    // longestWord
    public static String LogngestWord(String[] arr){
        /* for main==>
         String[] names ={"Zhaksybek", "Almaty", "Obama", "Steve", "Bill", "Armanjan"};

         String longFromStr =   LogngestWord(names);
        System.out.println(longFromStr);
         */
        String longWord ="";
        int max=0;
        for (int i=0; i<arr.length; i++){
            if (arr[i].length()>max){
                max =arr[i].length();
                longWord = arr[i];
            }

        }
return longWord;
    }



    // write  a method that an int array and returns the max number from the

    public static int maximum(int[] arr){
        /* for main==>>
         int[] arr2 = {1,2,3,57448,411,-955,54,40,0};

         int MaxValue = maximum(arr2);
        System.out.println(MaxValue);
         */
        Arrays.sort(arr);
        return arr[arr.length-1];
    }



    public static int addition(int a, int b){

        return a+b;
    }


} //class
