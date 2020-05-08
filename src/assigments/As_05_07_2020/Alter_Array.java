package assigments.As_05_07_2020;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Alter_Array {

    public static void main(String[] args)
    {
        int[] a = {1,2,3,4,5};
        mystery(a);
        for(int e : a)
        {
            System.out.print(e + " ");
        }
        // should print out 10 1 30 2 50

    }

    public static void mystery(int[] array)
    {
        for(int e : array)
        {
            if (e%2==0) {
                System.out.print(e/2 + " ");
            }else {
                System.out.print(e*10 + " ");
            }
        }
        

    }



    /*

    public static void main(String args[]){
        int n = 5;
        mystery(n);
    }

    public static void mystery(int n)
    {

        if(n == 0 || n==1)
        {
            return;
        }
        mystery(n-2);
        System.out.println(n);
        mystery(n-1);
    }

     */












/*
    public static void main(String[] args)
    {
        int[] a = {1,2,3,4,5};
        mystery(a);


        for(int e : a)
        {
            System.out.print(e + " ");
        }
        // should print out 10 1 30 2 50


    }


    public static void mystery(int[] array)
    {
        for(int e : array)
        {
            if (e%2==0) {
                System.out.print(e/2 + " ");
            }else {
                System.out.print(e*10 + " ");
            }
        }
        System.out.println();

    }

 */





/*
    public static void main(String[] args)
    {
        int[] a = {1,2,3,4,5};
        mystery(a);

        for(int e : a)
        {
            System.out.print(e + " ");
        }
        // should print out 10 1 30 2 50

    }


    public static int[] mystery(int[] array)
    {   int[] arr = new int[array.length];

    for (int i=0; i<array.length;i++){
        if (array[i]%2==0){
            arr[i]=array[i]/2;
        }else {
            arr[i]=array[i]*10;
        }
    }

    return arr;

    }





/*

        public static void mystery(int[] array)  {

            int[] result =new int[array.length];

            for (int i=0; i<array.length;i++){
                if (array[i] % 2==0){
                    result[i]= array[i]/2;
                }else {
                    result[i] = array[i]*10;
                }
        }

 */



}
