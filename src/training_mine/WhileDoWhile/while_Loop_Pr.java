package training_mine.WhileDoWhile;
import java.util.Scanner;
public class while_Loop_Pr {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        /*
        COUNT program with While LOOP
         */
 /*
        String sentence ="I like book, I read book book book , book , book";

        int count =0;
        while (sentence.contains("book")){
            count++;
            sentence = sentence.replaceFirst("book", "" );
        }
        System.out.println(count);
        System.out.println(sentence);


  */

        System.out.println("============================");

/*
        System.out.println("Enter your sentences with 'car' ");

        String sentence2 = scan.nextLine();

        int count2 =0;

        while (sentence2.contains("car")){

            sentence2 =sentence2.replaceFirst("car", "");
            count2++;
        }
        System.out.println(count2);
        System.out.println(sentence2);

 */
        System.out.println("===================================================");

        /*
        use loop to print all  even number between 1~100
         */



        for (int z=1; z <= 100; z++){
            if (z%2 ==0){
                System.out.print(z+" ");

            }
        }

        /*
        CONVER to while loop
         */
        System.out.println();
        System.out.println("==================================>");


        int z1 =1;
        while (z1<=100){
            if (z1%2==0){
                System.out.print(z1+" ");
            }
            z1++;
        }

        System.out.println();

        System.out.println();

        System.out.println("==================================>");
/*
        System.out.println("Starting number");
        int start =scan.nextInt();

        System.out.println("Ending number");
        int end = scan.nextInt();

        for (int j =start; j<=end; j++){

            if (j%2==0){
                System.out.print(j+ " ");
            }
        }



 */
        System.out.println();

        System.out.println("Starting number");
        int start2 =scan.nextInt();

        System.out.println("Ending number");
        int end2 = scan.nextInt();

        int j1=start2;
        while (j1<=end2){
            if (j1%2==0){
                System.out.print(j1+" ");
            }
            j1++;
        }









    }
}
