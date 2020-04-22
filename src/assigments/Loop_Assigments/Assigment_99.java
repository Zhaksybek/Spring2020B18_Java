package assigments.Loop_Assigments;
import java.util.Scanner;
public class Assigment_99 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int count = 0 ;
        //WRITE YOUR CODE HERE

        while (str.contains("hi")){
            count++;
            str = str.replaceFirst("hi","" );   // after counting first "Java"
        }
        System.out.println(count);




    }
}
