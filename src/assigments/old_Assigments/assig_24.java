package assigments.old_Assigments;
import java.util.Scanner;
public class assig_24 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String fullName,address, contacts;





        System.out.println("Welcome to the patient portal!");
        System.out.println("Please enter your personal information");

        System.out.println("Enter your first name");
        String firstName = scan.next();

        System.out.println("Enter your last name");
        String lastName = scan.next();



        System.out.println("Enter your email");
        String email = scan.next();


        scan.nextLine();//for street
        System.out.println("Enter your street");
        String street = scan.nextLine();

        System.out.println("Enter your city");
        String city = scan.nextLine();

        System.out.println("Enter your state");
        String state = scan.next();

        System.out.println("Enter your zip code");
        int zipCode = scan.nextInt();

        System.out.println("Enter your work phone number");
        long workPhoneNumber = scan.nextLong();

        System.out.println("Enter your personal phone number");
        long personalPhoneNumber = scan.nextLong();

        System.out.println("Enter your age"); //int age;
        byte age = scan.nextByte();

        System.out.println("Enter your height");
        double height = scan.nextDouble();

        System.out.println("Enter your weight");
        double weight= scan.nextDouble();

        System.out.println("Are you married?");
        boolean isMarried =scan.nextBoolean();
        System.out.println();

        contacts = "work phone number "+"- "+workPhoneNumber+", personal phone number - "+personalPhoneNumber+
                ", email: "+email;
        fullName = lastName+", "+firstName;
        address = street+", "+city+", "+state+" "+zipCode;

        System.out.println("Patient personal information");
        System.out.println("Full name: "+fullName);
        System.out.println("Address: "+address);
        System.out.println("Contacts: "+contacts);
        System.out.println("Age: "+age);
        System.out.println("Height: "+height);
        System.out.println("Weight: "+weight+" pounds");

        if (isMarried){
            System.out.println("Married?: true");
        }else  if (!isMarried){
            System.out.println("Married?: false");
        }











    }
}
