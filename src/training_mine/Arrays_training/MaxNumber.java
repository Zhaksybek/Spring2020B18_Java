package training_mine.Arrays_training;

public class MaxNumber {
    public static void main(String[] args) {

        int[] arr ={2,3,4,5,6,1000,8,-7,};

        int max = arr[0];

        for (int i=0; i< arr.length; i++){

            if (arr[i]>max){
                max= arr[i];
            }
          }
        System.out.println("Max number is "+ max);


    }
}
