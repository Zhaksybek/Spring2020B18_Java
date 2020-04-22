package day14_StringClass;
import  java.util.Scanner;
public class combineTwoString {
    public static void main(String[] args) {
        /*
        1. Ask user to enter two words. Print the first word, second word, second word, first word
			Input:
				one
				two
			Output:
				onetwotwoone
					DO NOT USE + OPERATOR
         */

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first words");
        String first = scan.next();

        System.out.println("Enter second word");
        String second = scan.next();

        String outout = first.concat(" "+ second).concat(" "+ second).concat(" "+first);


        System.out.println(outout);









    }
}
