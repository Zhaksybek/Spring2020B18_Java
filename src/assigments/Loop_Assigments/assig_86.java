package assigments.Loop_Assigments;
import java.util.Scanner;
public class assig_86 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int count =0;

        while (word.contains("java")){
            count++;
            word = word.replaceFirst("java","" );   // after counting first "Java"
        }
        System.out.println(count);




    }
}
