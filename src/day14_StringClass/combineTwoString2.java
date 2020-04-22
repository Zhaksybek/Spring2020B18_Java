package day14_StringClass;
import java.util.Scanner;
public class combineTwoString2 {
    public static void main(String[] args) {
        /*
        Ask user to enter two words. Print first word without its first character then print the second word without its first character.
			Input:
				apple
				banana
			Output:
				ppleanana
         */

        Scanner scan= new Scanner(System.in);

        System.out.println("Enter first words");
        String first = scan.next();  // Apple
               first =  first.substring(1, first.length()-1+1);

        System.out.println("Enter second word");
        String second = scan.next();
        second =  second.substring(1, second.length()-1+1);

        String result = first + " "+ second;
        System.out.println(result);





    }
}
