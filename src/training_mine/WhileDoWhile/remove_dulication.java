package training_mine.WhileDoWhile;
import java.util.Scanner;
public class remove_dulication {
    public static void main(String[] args) {
        /*
        input: aabbcc
        output: abc
         */

        Scanner scan= new Scanner(System.in);

        String s1 ="aabbcc";
        String result ="";// ab

        for (int i=0; i<s1.length(); i++){

            if (!result.contains(s1.substring(i,i+1) )){
                result +=s1.substring(i,i+1);
            }
        }//main for==> }
        System.out.println(result);


        System.out.println("=============================================");
/*

        System.out.println("Enter your characters: ");
        String word = scan.next(); //  input with duplicates:  "adadadaaaaaddddddggggggg"
        String result2= ""; // result without duplicates  output: adg

        for (int i=0; i<word.length();i++){

            if (!result2.contains(word.substring(i,i+1))){
                result2 +=word.substring(i,i+1);
            }

        }
        System.out.println(result2);
*/
        System.out.println("==============================================");

        /*
        System.out.println("Enter your characters: ");
        String word2 = scan.next();
        String result3 = "";

        for (int i=0; i<word2.length(); i++){

            if (!result3.contains(word2.substring(i,i+1))){
                result3 += word2.substring(i,i+1);
            }

        }
        System.out.println(result3);

         */


        System.out.println("==============================================");

/*
        System.out.println("Enter your characters: ");
        String word4 = scan.nextLine();
        String result4 = "";

        for (int i=0; i<word4.length(); i++){

            if (!result4.contains(word4.substring(i,i+1))){
                result4 += word4.substring(i,i+1);
            }

        }
        System.out.println("Result wihout duplication: "+ result4);

 */

        System.out.println("==============================================");
        System.out.println("Enter your characters: ");
        String word5 = scan.nextLine();
        String result5 = "";

        for (int i=0; i<word5.length(); i++){

            if (!result5.contains(word5.substring(i,i+1))){
                result5 += word5.substring(i,i+1);
            }

        }
        System.out.println(result5);


    }
}
