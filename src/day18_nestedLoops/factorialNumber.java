package day18_nestedLoops;
import java.util.Scanner;
public class factorialNumber {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);

        System.out.println("Emter a number");
        int i = scan.nextInt(); //5



          int result =1;

        while (i>=1){
            result *= i;
            i--;
        }
        System.out.println(result);


    }
}
