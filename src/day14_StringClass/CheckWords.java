package day14_StringClass;
import java.util.Scanner;
public class CheckWords {
    public static void main(String[] args) {
        /*
        Write a program CheckWords:
	Program accepts 3 words and :
	- if they are same length:      print "All words are same length"
	- if some same length and others not:    print "Not Same nor Different lengths"
	- if all different length :  print "All different length"
         */
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word");
        String word1 = scan.next();

        System.out.println("Enter first word");
        String word2 = scan.next();

        System.out.println("Enter first word");
        String word3 = scan.next();

        int lengh1 = word1.length();
        int lengh2 = word2.length();
        int lengh3 = word3.length();

        boolean allNotSame = lengh1 != lengh2 && lengh2 != lengh3 &&  lengh1 != lengh3;
        // none of then not same


        if (lengh1 == lengh2 && lengh2 == lengh3){
            System.out.println("All words have same lengh");
        }else if (allNotSame){
            System.out.println("All different lengh");
        }else {
            System.out.println("not Same nor Differtent lengts");
        }



    }
}
