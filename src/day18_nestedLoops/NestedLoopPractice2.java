package day18_nestedLoops;

public class NestedLoopPractice2 {
    public static void main(String[] args) {
        /*
        *
        * *
        * * *
        * * * *
        * * * * *
        * * * * * *
         */

        for (int j=9; j >= 1; j--){

            for (int i=1; i <= j; i++){
                System.out.print("* ");
            }
            System.out.println();

        }
        System.out.println();
        for (char ch2='a'; ch2 <= 'z'; ch2++){

            for (char ch='a'; ch <= ch2; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();

        }

        System.out.println();
        for (char ch2='z'; ch2 >= 'a'; ch2--){

            for (char ch='a'; ch <= ch2; ch++){
                System.out.print(ch+" ");
            }
            System.out.println();

        }






    }
}
