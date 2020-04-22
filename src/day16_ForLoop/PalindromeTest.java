package day16_ForLoop;

import java.util.Scanner;

public class PalindromeTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your words");

        String word = scan.nextLine(); //Java
        String reversWord = "";

        for (int i = word.length()-1; i >=0; i-- ){
                         reversWord +=   word.charAt(i);


        }
        System.out.println(reversWord);


        boolean palindrome = word.equals(reversWord);

        System.out.println(palindrome);





    }
}
