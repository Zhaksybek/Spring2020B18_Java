package training_mine.Arrays_training;

public class Array_1 {
    public static void main(String[] args) {

        int[] arr = { 1, 2};

        String[] names = {"Jake", "Marat",  "Margulan", "Jansaya", "Madina" };

        System.out.println(names[3]);
        System.out.println(names[4]);

        String str1 = names[1];
        String str2 = names[3];

        System.out.println(names[0]);

        double[] myArray = {1, 2, 3, 4, 5, 8, 0, 2};
              //            0  1  2  3  4  5  6  7

        for ( int i=1; i <= 7;i++){
            System.out.print(myArray[i]+" ");
        }
        System.out.println();


        String str ="ABC";
        int A= str.length();


        int[] numbers ={12, 24, 48, 96, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11  };
        // lenght of Array:

        int B = numbers.length;  // in Array length method without () braces
        System.out.println(B);

        int HighestIndexNum = numbers.length-1;
        System.out.println(HighestIndexNum);


        for (int i=0; i < numbers.length; i++){
            int s1 = numbers[i];
            System.out.print(numbers[i]+" ");

        }

        System.out.println();
        System.out.println("====================================");

        char[] myChars = {'A', 'B', 'C', 'D'};
        int HighestIndexNum2 = myChars.length;
        System.out.println(HighestIndexNum2);










    }
}
