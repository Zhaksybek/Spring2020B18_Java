package day16_ForLoop;
import java.util.Scanner;
public class quiz {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your user name");
        String user = scan.nextLine().toLowerCase();

        System.out.println("Enter your password");
        String passWord =scan.nextLine();

        String userName = "cybertek.batch18@gmail.com";
        String password = "Javangers";

        if (user.endsWith("@gmail.com")){

            if (user.equalsIgnoreCase(userName) && passWord.equals(password)){
                System.out.println("Loget in successfully");
            }else {
                System.out.println("Invalid username or password");
            }


        }else {
            System.out.println("it's not valid email address");
        }


        
    }
}
