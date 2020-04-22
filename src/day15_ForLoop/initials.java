package day15_ForLoop;
import java.util.Scanner;
public class initials {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name:");
        String firName = scan.next();
        System.out.println("Enter your last name:");
        String lastName = scan.next();

        String intials = firName.substring(0, 1) + lastName.substring(0,1);
        System.out.println("Your initials is: " +intials.toUpperCase());

        String intials2 = firName.charAt(0) +""+ lastName.charAt(0);

        System.out.println(intials2.toUpperCase());



    }

}
