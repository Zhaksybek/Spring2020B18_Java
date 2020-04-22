package day14_StringClass;
import java.util.Scanner;
public class credentials {
    public static void main(String[] args) {

         /*
        userName:  cybertek
        passWord:  cybertekshool
         */
         Scanner scan = new Scanner(System.in);

         String valiUserName = "cybertek";
         String validPassword = "cybertekschool";

        System.out.println("Enter user name");
        String inpuUserName = scan.next();

        System.out.println("Enter your password");
        String inputPassWord = scan.next();

        boolean validCrediantials = valiUserName.equals(inpuUserName) &&  validPassword.equals(inputPassWord);


        //if ((valiUserName.equals(inpuUserName))&& (validPassword.equals(inputPassWord)))

        if (validCrediantials){
            System.out.println("Welcome to Facebook");
        } else {
            System.out.println("Invalid credentials");

        }





    }
}
