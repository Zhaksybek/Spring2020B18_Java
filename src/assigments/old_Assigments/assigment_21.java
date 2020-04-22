package assigments.old_Assigments;
import java.util.Scanner;
public class assigment_21 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter area code: ");
        int areaCode = scan.nextInt();

        System.out.println("Enter Local number");
        int localNumber = scan.nextInt();

        String phoneNumber = "areaCode" + "localNumber";

        System.out.println("Calling number "+areaCode + localNumber);

        System.out.println( "(" + areaCode+")" +"-"+ localNumber);





    }
}
