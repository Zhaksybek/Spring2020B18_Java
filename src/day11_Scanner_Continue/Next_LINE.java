package day11_Scanner_Continue;
import java.util.Scanner;
public class Next_LINE {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the full name");
        String  fullName = scan.nextLine();

        System.out.println("Your full name is: "+fullName);
        String sentences = scan.nextLine();

        System.out.println("Your sentences is: "+sentences );




    }
}
