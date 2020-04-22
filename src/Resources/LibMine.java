package Resources;

import java.util.Arrays;

public class LibMine {
    public static void main(String[] args) {




    }// main

    public static int[] DescenArr(int[] arr){
        /*
                int[] Array ={-99, 7, 0, 10 , -99 , 35 , 3 ,0  };
        int[] desArray = sortDescending(Array);
        System.out.println(Arrays.toString(desArray));

         */
        Arrays.sort(arr);
        int[] DesArr = new int[arr.length];
       /*
       DesArr[0] = arr[arr.length-1] ==lastIndex
        */
        int j = arr.length-1;
        for (int i=0; i<arr.length;i++){
            DesArr[i] = arr[j];
            j--;
        }
        return DesArr;
    }


    public static int maxNumArr(int[] arr){
        /*
         int[] array = {1,8,2,-6,5,5,56,3,6,77,7,1,0, 50 ,3};

      int MaxNumber = maxnumber(array);
        System.out.println(MaxNumber);

         */

        Arrays.sort(arr);
        int maxNum = arr[arr.length-1];
        return maxNum;
    }



    public static int[] combineTwoArr(int[] arr,int[] arr2){
        /*
          int[] ar ={1,2,3};
        int[] ar2 = {6,8,4};
        int[] ar3= combineTwoArr(ar,ar2);
        System.out.println(Arrays.toString(ar3));
         */
        int[] arr3 =new int[arr.length + arr2.length];

        for (int i =0; i<arr.length; i++){
            arr3[i] =arr[i];
        }

        for (int j=0; j<arr2.length; j++){
            arr3[arr.length+j] = arr2[j];
        }

      return arr3;

    }







} // class
