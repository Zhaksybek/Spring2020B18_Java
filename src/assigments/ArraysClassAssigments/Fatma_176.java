package assigments.ArraysClassAssigments;

public class Fatma_176 {

        public static void main(String[]args){
            int nums[]={1,6,2,3};

            double []number={1.0,9,2.0, 5.0};

            System.out.println(findmax(nums));
            System.out.println(findmax(number));


        }
        public static int findmax(int [] arr){
            int maxnum=arr[0];
            for(int i=0; i<arr.length; i++){
                if(arr[i]>= maxnum){
                    maxnum=arr[i];
                }
            }
            return maxnum;
        }
        public static double findmax(double[] arr){
            double maxnum= arr[0];
            for(int i=0; i<arr.length; i++){
                if(arr[i]>= maxnum){
                    maxnum=arr[i];
                }
            }
            return maxnum;
        }
    }

