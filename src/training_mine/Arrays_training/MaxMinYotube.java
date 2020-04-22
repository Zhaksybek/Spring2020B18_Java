package training_mine.Arrays_training;

public class MaxMinYotube {
    public static void main(String[] args) {

        int[] inputArray = {-8,11,12,1300,2,25,65,34,99,87,56,-5,55,65,3,88};

        int min = inputArray[0];
        int max = inputArray[0];

        for (int i=0; i<inputArray.length; i++){
            if (inputArray[i]<min){
                min= inputArray[i];
            }
            if (inputArray[i]>max){
                max =inputArray[i];
            }


        }
        System.out.println("Minimum number is: "+min);
        System.out.println("Max number is: "+max);




    }
}
