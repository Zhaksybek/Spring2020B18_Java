package training_mine.StringCLASS;
import java.util.Scanner;
public class Practice3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter first name");
        String firName =scan.next();
        String lastName= scan.next();

        String FullName = firName.substring(0,1).toUpperCase() + firName.substring(1).toLowerCase()
                + " " + lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

        System.out.println(FullName);


    }
}
