package day010_Switch_Scanner;
import java.util.Scanner;
public class Scanner_Practice {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your first number");
                 short num= input.nextShort();

        System.out.println("Enter your second number");
                 int num2 = input.nextShort();
                 int b = input.nextInt();
        System.out.println("The sum of those two numbers are: "+(num+num2));




    }
}
