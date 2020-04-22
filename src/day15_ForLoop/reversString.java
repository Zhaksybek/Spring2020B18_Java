package day15_ForLoop;
import java.util.Scanner;
public class reversString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        int lastIndexNum = word.length()-1;

        String revers2 = "";

        for (int i =lastIndexNum ;  i >=0 ; i--  ){
            //System.out.print(word.charAt(i));
        revers2 += word.charAt(i);
        }

        System.out.println(revers2);


    }
}
