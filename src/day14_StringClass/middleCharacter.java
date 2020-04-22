package day14_StringClass;
import java.util.Scanner;
public class middleCharacter {
    public static void main(String[] args) {
        /*
        Write a Java method to display the middle character of a string
		a) If the length of the string is even there will be two middle characters.
		b) If the length of the string is odd there will be one middle character.
				Input :
					elephant
				Output:
					The middle character in the string: ph
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = scan.next(); //  Cyber

        String middleCharacter = ""; // to store the middle character at the end

        int totalChars = word.length(); // 5
        int middleNumber = totalChars/2;   //  5/2 ==> 2

        if (totalChars % 2 != 0){   //odd numbers
            middleCharacter += word.charAt(middleNumber);

            middleCharacter = middleCharacter + (word.charAt(middleNumber));
        }else {

            //middleCharacter  = middleCharacter + word.charAt(middleNumber - 1 )+ word.charAt(middleNumber);

            middleCharacter += word.charAt(middleNumber - 1)+ "" + word.charAt(middleNumber);

            // any thing we added to a string will return it as string

        }

        System.out.println("Middle character is: " +  middleCharacter);








    }
}
