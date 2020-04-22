package day23_methods;

import java.util.concurrent.TimeUnit;

public class UniqueValues {
    public static void main(String[] args) {
/*
warmup task:
	1.  Write a program that can print out the unique values from a String Array
			Ex:
				if arr -> {"A", "A", "B", "C", "C"}
				output: B
				if arr -> {"A", "B", "B", "C"}
				output:  A
						 C
			MUST use for each loop
 */
        System.out.println("==========WITH FOR EACH LOOP UNIQ===============================================");

        String[] arr ={"A","B","A"};

      for (String each2: arr) {

      int count = 0;
      for (String each : arr) {
        if (each.equals(each2)) {
            count++;
        }

      }

      if (count == 1) {
        System.out.println(each2);
      }

}


        System.out.println("==========WITH FOR LOOP UNIQ===============================================");

       //   String[] arr ={"A","B","A"};

     for (String each3:  arr ) {

         int count2 = 0;
         for (int i = 0; i < arr.length; i++) {
             if (arr[i].equals(each3)) {
                 count2++;
             }
         }
         if (count2 == 1) {
             System.out.println(each3);
         }

     }// ==>> for each



        /*
        String result="";
        for (String each: arr){

            for (int i=0; i<arr.length; i++){
            if (!result.contains(Arrays))
            }
        }*/

    }
}
