package training_mine.Arrays_training;

public class Array_4_MinNumber {
    public static void main(String[] args) {
      // VIDEO:  30 min: 22 second day24_java recap 09.20.19
        int[] arr ={100, 2, 2, 3, 4, 5, 6 };
              int min=0;

        for (int i=0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];

            }
        }
        System.out.println("min number is "+min);


    }
}
