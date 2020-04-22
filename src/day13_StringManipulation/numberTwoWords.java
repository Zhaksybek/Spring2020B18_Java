package day13_StringManipulation;
import java.util.Scanner;
/*
 write a java program that can convert any given numbers between 0 ~ 9 to words, if the number is greater than 9 or less than zero, out put should be "Invalid".
			MUST use Scanner and switch statement
 */
public class numberTwoWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 0 ~ 9");
        byte num = scan.nextByte();
        String convert ="";


        switch (num){

            case 0:
                convert = "Zero";
                break;
            case 1: convert ="One";
                break;
            case 2: convert ="two";
                break;
            case 3: convert = "Three";
                break;
            case 4: convert = "four";
                 break;
            case 5: convert = "five";
                break;
            case 6: convert = "Six";
                break;
            case 7: convert = "seven";
                break;
            case 8: convert = "eight";
                break;
            case 9: convert = "nine";
            break;
            default:  convert = "Invalid";

        }

        String result2 =(num==0)?"one":(num==1)?"Two":(num==2)?"Two":(num==3)?"three"
        :(num==4)?"four":(num==5)?"five":(num==6)?"six":(num==7)?"seven":(num==8)?"eight":
                (num==9)?"nine":"invalid";

        System.out.println(convert);
        System.out.println(result2);








    }
}
