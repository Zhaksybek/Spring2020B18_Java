package assigments.old_Assigments;
import java.util.Scanner;
public class assig_72 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String email = scan.next();

        String result ="";
        String domain = "";
        String topLevel ="";

        if (email.contains("_")){    // craig_federighi@apple.com
                                    //  0123
            String firstName = email.substring(0,email.indexOf("_"));
            firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
            String lastName = email.substring(email.indexOf("_")+1, email.indexOf("@"));
            lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();

            domain = email.substring(email.indexOf("@")+1, email.indexOf("."));
            topLevel=email.substring(email.indexOf(".")+1);

            System.out.println("First name: "+firstName);
            System.out.println("Last name: "+lastName);
            System.out.println("Domain: "+domain);
            System.out.println("Top-Level Domain: "+topLevel);



        }else {
            System.out.println(email);
        }




    }
}
