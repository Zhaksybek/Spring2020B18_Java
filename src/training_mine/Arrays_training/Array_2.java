package training_mine.Arrays_training;

import java.util.Scanner;

public class Array_2 {
    public static void main(String[] args) {

        String[] AllStudents ={"Marjan", "Aigerim", "Elvira", "Balausa"};
                 AllStudents[0] = "Armanjan";


        // intialize the size only wihout giving value:


        // initialize the size only without giving value:
              int[] array = new int[4];

        System.out.println(array.length);
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);

        //give values to the array:

        array[1]=100;
        System.out.println(array[1]);

        array[0]=200;
        System.out.println(array[0]);

        /*
        array[5]=500;
        System.out.println(array[5]);
        will give compiler error because Arrays value fixet; it was ==> [4]  and we cant give ==>[5]
*/

        int[] array2;
        // System.out.println(array2[0]); arrays size must be initialized


        Scanner scan = new Scanner(System.in);
         int[] Input = new int[5];
         //we can store 10 element; highest number is 9


         for (int i=0; i < Input.length; i++){
             System.out.println("Enter a number");
                  Input[i] = scan.nextInt();
         }

         for (int i=0; i < Input.length; i++){
             System.out.print(Input[i]+" ");
         }

         String[] AllStudentsNames= new String[358];

         // this new Keyword in array is used to give the size of








    }

}
