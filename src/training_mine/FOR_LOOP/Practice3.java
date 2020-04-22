package training_mine.FOR_LOOP;
import com.sun.deploy.util.SyncAccess;

import java.util.Scanner;
public class Practice3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int sum =0;

        for (int i =1; i<=10; i++) {

                System.out.println("Enter your number " +  "times");
                int inputNum = scan.nextInt();
                sum += inputNum;

        }
        System.out.println("NUMBERS SUM IS: "+sum);



    }
}
