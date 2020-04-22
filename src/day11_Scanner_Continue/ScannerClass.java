package day11_Scanner_Continue;
import java.util.Scanner;
public class ScannerClass {
    public static void main(String[] args) {

     Scanner input = new Scanner(System.in);

        System.out.println("Enter a long number: ");
        long a = input.nextLong();

        System.out.println("You have entered: "+a);

        System.out.println("Enter a decimal number: ");
                     double f =    input.nextDouble();

        System.out.println("You have entered: f"+f);


        System.out.println("Enter ture or false");
                  boolean bool= input.nextBoolean();

        System.out.println(bool);

        System.out.println("Enret your sentence");

        String str = input.next();
        System.out.println("You have entered str: "+str);











    }


}
