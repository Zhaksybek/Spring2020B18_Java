package assigments.Loop_Assigments;
import java.util.Scanner;
public class Print_vowels {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
       // System.out.print("In:");

        String word = "howdyho";
        //write your code below
        String result="aeiou";

        for (int i=0;i<word.length();i++){
            if (result.contains(word.substring(i,i+1))){
                result+=word.substring(i,i+1);
            }
        }

        System.out.println(result.substring(5));


    }
}
