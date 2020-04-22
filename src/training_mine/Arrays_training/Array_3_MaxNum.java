package training_mine.Arrays_training;

public class Array_3_MaxNum {
    public static void main(String[] args) {
        /*
        Find  first and second Max number
         */


        int[] arr = {20, 200, 30, 40, 50, 500 };
             int maximum =0;
             for (int i=0; i<arr.length; i++){
             if (arr[i] > maximum){
                maximum = arr[i];
                }

             }
        System.out.println("Maximum number is: " +maximum);

             int secondMax = 0;
             for (int j=0; j < arr.length; j++){
                 if (arr[j] > secondMax && arr[j] != maximum){
                     secondMax =arr[j];

                 }
             }
        System.out.println("second Maximum number is: "+secondMax);




    }
}
