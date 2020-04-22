package day15_ForLoop;
import java.util.Scanner;
public class revers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = "Java";

        String revers = ""+ str.charAt(3) + str.charAt(2)+str.charAt(1)+str.charAt(0);


        System.out.println(revers);



    }
}
