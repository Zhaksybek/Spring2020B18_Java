package day18_nestedLoops;

public class NestedLoopPractice {
    public static void main(String[] args) {

        for (int j=1; j<=5; j++){

            for (int i =1; i<=5; i++){ //nested loop
                System.out.print(i+" ");
            }//nested
            System.out.println();// ==? for break line


        }

        System.out.println("=============================================================");

        System.out.println("=============================================================");
        /*
                   ******
                   ******

         */

        for (int i=0; i < 7; i++) { //outter loop repeating the inneer loop ovaer and over again

            int a = 1;
            while (a <= 7) {

                System.out.print("*");
                a++;
            }
            System.out.println();

        }












    }
}
