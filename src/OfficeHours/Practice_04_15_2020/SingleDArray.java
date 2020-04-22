package OfficeHours.Practice_04_15_2020;

import java.util.Arrays;

public class SingleDArray {
    public static void main(String[] args) {

        int a = 100;
        int[] arr={100,200,300};
        //          0   1   2

        System.out.println(arr[1]);

        for (int i=0; i < arr.length; i++ ){
            //System.out.println(i);
                int num =  arr[i];
            System.out.println(num);
        }


        int j =0;
        while (j < 3){
            int num = arr[j];
            System.out.println(num);
            j++;
        }


        System.out.println("======= r evers=======================================");

        String[] names = {"Jake", "Harun",  "Aidan","Doni", "Jansaia", "Arman"};

        String[] namesRev = new String[names.length];

        int k =0;
        for (int i=names.length-1; i>=0; i--){
            namesRev[i]=names[k];
            k++;
        }

        System.out.println(Arrays.toString(namesRev));


        System.out.println("======= WHILE =======================================");

        int i =0;
        int b = names.length-1;

        while(i < names.length-1){

            namesRev[i] = names[b];
            i++;
            b--;
        }


        System.out.println(Arrays.toString( namesRev ) );





    }
}
