package assigments.ArraysClassAssigments;

import java.util.Arrays;

public class Switch {
    public static void main(String[] args) {
        int[] arr ={7,2,3,5};
       // int[] arr2= new int[arr.length];

        int first =arr.length-1; //5
        int last =arr[0];       //7

        arr[0]=first;   //5
        arr[arr.length-1]=last;

        System.out.println(Arrays.toString(arr));

     /*
        arr2[0]=arr[arr.length-1];

        for (int i=0;i<arr.length-1;i++){
            arr2[1+i] = arr[i];
            //arr2[arr[1] + i ]  =  arr2[i];
        }
        System.out.println(Arrays.toString(arr2));

        System.out.println(Arrays.toString(do_switch(arr)));


        //
    }

    public static int[] do_switch(int[] i)
    {
        int[] arr2= new int[i.length];

        arr2[0]=i[i.length-1];

        for (int j=0;j<i.length-1;j++){
            arr2[1+j] = i[j];

        }
        return arr2;
*/

    }
}
