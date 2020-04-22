package training_mine.FOR_LOOP;
import java.util.Scanner;
public class Practice4 {
    public static void main(String[] args) {

        /*
        enter 5 num and find Max num?
         */
        Scanner scan = new Scanner(System.in);
        int max =0;

        for (int i=0; i<=5; i++) {
            System.out.println("Enter a number");
            int inputNum = scan.nextInt();
        if (inputNum > max){
            max = inputNum;

                      }//if max
                }
        System.out.println("Max num is: "+max);



    }
}
