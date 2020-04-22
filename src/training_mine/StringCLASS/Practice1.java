package training_mine.StringCLASS;
import java.util.Scanner;
public class Practice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first name:");
        String firstName= scan.nextLine();

        System.out.println("Enter your last name:");
        String lastName = scan.nextLine();


        String fullName = firstName.concat(" ").concat(lastName);

        int numOfCHAR= fullName.length();

        System.out.println(fullName+ " contains "+numOfCHAR+" characters");





    }
}
