package day27_DateTime;

public class Find_MinimumArr {
    /*
    Warmup task:
		1. write a return method that can return the minimum number from an int array
		2. write a return method that can return the minimum number from a double array
					NOTE: apply method overloading,  DO NOT USE SORT METHOD.
     */

    public static void main(String[] args) {

        int[] arr = {5,4,7,5,0,-4,8,66};
        int min = arr[0];

        for (int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println(min);

        System.out.println("====================================================");

        int minArr = minNumArr(arr);
        System.out.println(minArr);

        double minDouArr = minNumArr(arr);
        System.out.println(minDouArr);




    }

    public static int minNumArr(int[] arr){
        int min = arr[0];

        for (int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    } //  int min


    public static double minNumArr(double[] arr){
        double min = arr[0];

        for (int i=0;i<arr.length;i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    } // double min





    public static int maxNumArr(int[] arr){
        int max = arr[0];

        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    } //max


    /*
    MUHTARS CODE==================================================>

      public static void main(String[] args) {
        int[] arr = {5, 4, 7, 5};

        int minimum = arr[0]; //4

        for(int each  : arr ){ //each: 5, 4, 7, 5

            if(each < minimum){
                minimum = each;
            }

        }

        System.out.println(minimum);

        int[] arr2 = {100,2000,3000,40,50, -100, -9000};

        System.out.println(  minimum(arr2)  );

        double[] arr3 = { 55.5 , 10.5, 1.5, 2.5 , 0, -10.25 };
         double num1 =   minimum(arr3);

        System.out.println(num1);

    }

    public static int minimum(int[] arr){

        int minimum = arr[0]; //4
        for(int each  : arr ){ //each: 5, 4, 7, 5
            if(each < minimum){
                minimum = each;
            }
        }

        return minimum;
    }

    public static double minimum(double[] arr){

        double minimum = arr[0]; //4
        for(double each  : arr ){ //each: 5, 4, 7, 5
            if(each < minimum){
                minimum = each;
            }
        }

        return minimum;

    }


Muhtars Code
     */



} //class
