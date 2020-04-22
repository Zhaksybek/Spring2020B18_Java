package training_mine.Arrays_training;

public class minNumber {
    public static void main(String[] args) {

        int[] arr ={2,3,-8,5,6,1000,8,-7,};

        int min = arr[0];

        for (int i=0; i < arr.length; i++ ){
            if (arr[i]<min){
                min=arr[i];
            }

        }
        System.out.println("Min number is: "+min);





    }
}
