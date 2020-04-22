package day13_StringManipulation;
import java.util.Scanner;
public class shippingInfo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your building number");
        String Bnumber= scan.next();


        scan.nextLine();// if you have after (next) wanna use (nextLine) u need to give epmty (nextLine)


        System.out.println("Enter your street address");
        String street = scan.nextLine();

        System.out.println("Enter your city name");
        String cityName = scan.nextLine();

        System.out.println("Enter your state");
        String state = scan.nextLine();

        System.out.println("Enter your zipcode");
        String zipcode = scan.next();

        scan.nextLine();

        System.out.println("enter your Full name");
        String fullName = scan.nextLine();
        /*
        Jimmy joe
							  7925 Jones Branch Dr
							  MCLean, VA 22102
         */

        String result = "Ship to: "+fullName+ "\n"+"\t\t"+Bnumber+" "+street+"\n"+"\t\t"+cityName+", "+state+" "+zipcode;
        System.out.println(result);








    }
}
