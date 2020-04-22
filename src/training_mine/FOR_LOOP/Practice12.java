package training_mine.FOR_LOOP;
import java.util.Scanner;
public class Practice12 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter your number");
        int num = scan.nextInt();
        int sum =0;

        for (int i=1; i<=num; i++){    // num is cicle of for
                                       // i is main increment
            sum +=i;
        }
        System.out.println(sum);


    }
}
