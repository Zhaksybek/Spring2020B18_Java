package assigments.ArraysClassAssigments;
import java.util.Scanner;
public class Assig_105 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] words = {input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine(),input.nextLine()};
           String result ="";

        for (int i=0; i<words.length; i++){
           result += words[i].substring(0,1) + words[i].substring(words[i].length()-1)+", ";
        }
        System.out.println("["+result.substring(0,result.length()-2)+"]");





    }
}
