package assigments.Loop_Assigments;
import java.util.Scanner;
public class CountAndRemoveDuplicate {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();

        int count =0;
        while (str.contains("cat")){
            count++;
            str = str.replaceFirst("cat","" );   // after counting first "Java"
        }
        System.out.println(count);






    }
}
