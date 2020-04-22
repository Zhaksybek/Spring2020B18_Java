package training_mine.Arrays_training;

public class Array_5_Unique {
    public static void main(String[] args) {
        /*
        find unique value
         */
        String[] arr = {"A", "A", "A", "A", "B", "C", "C"};
        //               0     1    2   3     4
        // how many time "A" is appeared in the array

        for (int j = 0; j < arr.length;j++){

            int count =0;
            for (int i=0; i < arr.length; i++){

                if (arr[i].equals(arr[j])){
                    count++;
                }

            }

            if (count == 1) {
                System.out.println(arr[j]); //B
            }

        }

        //System.out.println(count);



    }
}
