package day27_DateTime;

public class inique_Arrays {
    /*
    3. write a method that can print out the unique elements from an int array
					Ex: {1,1,2,3,3} ==> 2
						{6,6,7,7,8,9} ==> 8 9
     */
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4};

    for (int each2 : arr) {
        int count = 0;
        for (int each : arr) {
            if (each == each2) {
                count++;
            }
        }
        if (count == 1) {
            System.out.println(each2);
        }
    }


    int[] arr2 = {3,6,4,8,9,5,0,0, 0,5,-9 ,5,9,7,4,1,3,0,5,6};
        uniqueElements(arr2);

    double[] arr3 = {1.1,5.6,2.8,8.9,7.0,70.8, 1.1,1.1,5.6,2.8,8.9 };
    uniqueElements(arr3);

    }//main

    public static void uniqueElements(int[] arr){
        for (int each2 : arr) {
            int count = 0;
            for (int each : arr) {
                if (each == each2) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each2);
            }
        }
    }

    public static void uniqueElements(double[] arr){
        for (double each2 : arr) {
            int count = 0;
            for (double each : arr) {
                if (each == each2) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(each2);
            }
        }
    }



} //class
