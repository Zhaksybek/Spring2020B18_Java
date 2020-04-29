package training_mine.WrapperClass_ArrayListMine;

import java.util.*;

public class ArrayList_Practice2 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0; i<31;i++){
            if (i%2==0){
                list.add(i);
            }
        }
        System.out.println(list);


        System.out.println(list.size());

        System.out.println(list.get(4));


        for (int i=0; i<list.size();i++){
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

        for (Integer each : list){    // unboxing
            System.out.print(each+ " ");
        }
        System.out.println();



               int num = list.get(7); // unboxing

       // list.clear();


        // sorting the arrayList

        ArrayList<Integer> list2 = new ArrayList<>();

        for (int i=20; i>=0; i--){
            list2.add(i);
        }


        Collections.sort(list2);

        // Collections and Collection not same

        System.out.println(list2);




    }
}
