package assigments.As_05_07_2020;

import java.lang.reflect.Array;
import java.util.*;


public class Needs_switch_elements {

    public static void main(String[] args) {

        int[] i={7,2,3,5};
        int[] result =new int[i.length];

        int first = i[0];
        int last = i[i.length-1];

        i[0]=last;
        i[i.length-1]=first;

        System.out.println(Arrays.toString(i));


        //for ()






        /*
        int[] arr = new int[i.length];
        ArrayList<Integer> list = new ArrayList<>();
        for (int each:i ){
            list.add(each);
        }
        list.set(0,i[i.length-1]);
        list.set(i.length-1,i[0]);
        for (int j=0;j<list.size();j++){
            arr[j]=list.get(j);
        }

         */
      //  System.out.println(Arrays.toString(do_switch(i)));


    }
/*
    public static int[] do_switch(int[] i)
    {


        int[] arr = new int[i.length];

        ArrayList<Integer> list = new ArrayList<>();
        for (int each:i ){
            list.add(each);
        }
        list.set(0,i[i.length-1]);
        list.set(i.length-1,i[0]);
        for (int j=0;j<list.size();j++){
            arr[j]=list.get(j);
        }
        return arr;


    }

 */



    /*
    public static int[] do_switch(int[] i)
    {
        int[] arr = new int[i.length];
        ArrayList<Integer> list = new ArrayList<>();
        for (int each:i ){
            list.add(each);
        }
        list.set(0,i[i.length-1]);
        list.set(i.length-1,i[0]);
        for (int j=0;j<list.size();j++){
            arr[j]=list.get(j);
        }
        return arr;

    }

     */





}
