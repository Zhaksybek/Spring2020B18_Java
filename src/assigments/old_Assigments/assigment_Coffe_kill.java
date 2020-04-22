package assigments.old_Assigments;
import java.util.Scanner;
public class assigment_Coffe_kill {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number of milligrams in drink:");

        int milligramsIndrink = scan.nextInt();

        int drink = milligramsIndrink/100;

        System.out.println("It would take about "+drink+" drinks for a lethal overdose.");



    }
}
