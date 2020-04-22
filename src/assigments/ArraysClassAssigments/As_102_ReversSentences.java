package assigments.ArraysClassAssigments;
import java.util.Arrays;
import java.util.Scanner;
public class As_102_ReversSentences {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();


       // String reversed = "";
        String[] splitSen = sentence.split(" ");

        for (int i=0;  i<splitSen.length; i++){
            System.out.println(splitSen[i]);

        }





    }
}
