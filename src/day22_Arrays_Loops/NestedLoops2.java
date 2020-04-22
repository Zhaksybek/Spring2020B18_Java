package day22_Arrays_Loops;

public class NestedLoops2 {
    public static void main(String[] args) {
        int[][] number ={ {9,8,7}, {6}, {5,4,3,2,1,0} };
        //                  0        1     2

        /*
             number[0] ==> {9, 8, 7}
             number[1] ==> {5}
             number[2] ==> {5,4,3,2,1,0}

         */

        //0 1 2 3 4 5 6 7 8 9  TASK:3
        for (int j =number.length-1; j>=0; j--){
            for (int i=number[j].length-1; i>=0; i--){
                System.out.print(number[j][i]+" ");
            }

        }


        System.out.println();
        System.out.println();




        System.out.println("====================");



        for (int j=0; j < number.length; j++){ // its for   main arr ==>  0    1   2

            for (int i=0; i < number[j].length; i++){//its for each single arr==> {9,8,7} etc..
                System.out.print(number[j][i]+" ");
            }
            System.out.println();//line breaker after 1D arrays

        }


        System.out.println("========TASK 1=======================");
           //TASK 1
        //   7 8 9   6 0 1   1 2 3 4 5
        //   { {9,8,7}, {6}, {5,4,3,2,1,0} };

        for ( int k =0; k < number.length; k++){   // k: index number of 1D arrays
            for (int i=number[k].length-1; i >= 0; i--){  // i: index num of elements in 1D
                System.out.print(number[k][i]+" ");
            }
        }

        System.out.println();
        System.out.println();
        System.out.println("========TASK 2=======================");
        //TASK 2
        //   5 4 3 2 1 0 6 9 8 7
        //   { {9,8,7}, {6}, {5,4,3,2,1,0} };

         for (int k= number.length-1; k >=0; k--){ // k: index of 1D arrays (reversed)
             for (int i= 0; i < number[k].length; i++){  //  i: index num of elements in 1D
                 System.out.print(number[k][i]+" ");
             }
         }






        System.out.println();
        System.out.println("========TASK 3=======================");
        //TASK 3
        //  // 0 1 2 3 4 5 6 7 8 9
        //   { {9,8,7}, {6}, {5,4,3,2,1,0} };

        for (int k= number.length-1; k >=0; k--){ // k: index of 1D arrays (reversed)
            for (int i= number[k].length-1; i>=0;  i--){  //  i: index num of elements in 1D
                System.out.print(number[k][i]+" ");
            }
        }







    }
}
