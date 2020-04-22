package day12_JavaRecap;
import java.util.Scanner;
public class Scanner_NextLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your company name:");
        String name = scan.next();

        scan.nextLine();// needs to give empty one(If you wanna use "nextLine" method)
        System.out.println("Your full name");
        String fullName = scan.nextLine();







    }
}
