package day12_JavaRecap;
import java.util.Scanner;
public class Scanner_NextLine_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Building number:");
        int Bnumber = scan.nextInt();

        System.out.println("Building number is: "+Bnumber);

        scan.nextLine();

        System.out.println("Street: ");
        String street = scan.nextLine();

        System.out.println("Street IS: "+street);

        System.out.println("Enter the zip code: ");
        int zipCode = scan.nextInt();

        scan.nextLine();// make empty

        System.out.println("Enter the city name and state separated by comma and space");
        String cityState = scan.nextLine();

        String fullAdress = Bnumber+" "+street+", "+cityState+" "+zipCode;

        System.out.println(fullAdress);












    }
}
