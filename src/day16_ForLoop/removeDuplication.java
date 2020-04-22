package day16_ForLoop;

import java.util.Scanner;

public class removeDuplication {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String str = scan.next();

        /*
        task:
    write a program that can remove duplicated characters from a string
         */

       // String  str = "ABAB"; //// "AB" we store the expected result in this variable
        //             0123
        String result ="";

        for ( int i=0; i <=str.length()-1; i++){
          /*
            if (!result.contains(""+str.charAt(i))){   // ! if does not contain character
                result += str.charAt(i);
            }   */


          if (result.contains(""+str.charAt(i))){  // // if the string result does not contains str.charAt(i), then we concate it to the result, if it does we will not concate it to the result
                                                     //
              continue;
          }
          result += str.charAt(i);

        }

        System.out.println(result);


    }
}
