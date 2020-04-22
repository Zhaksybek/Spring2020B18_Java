package training_mine.StringCLASS;
import java.util.Scanner;
public class Practice2 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("Enter your first and last name");
        String firstName = scan.next();
        scan.nextLine();
        String lastName = scan.nextLine();

        String initials = firstName.substring(0,1).toUpperCase()+"."+ (lastName.substring(0,1).toUpperCase()).concat(".");
        System.out.println("Initials is: " +initials);



    }
}
