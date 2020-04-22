package day14_StringClass;
import java.util.Scanner;
public class credentials2 {
    public static void main(String[] args) {

           /*
valid credendials are:
userName: cybertek
pasword: cybertekschool


         */
    Scanner scan = new Scanner(System.in);
        System.out.println("Enter user name");
        String inpuUserName = scan.next();

        System.out.println("Enter your password");
        String inputPassWord = scan.next();

        boolean logget =inputPassWord.equals("Cybertek")  && inputPassWord.equals("cybertekschool");
        boolean invalidUserName = !inpuUserName.equals("Cybertek") && inputPassWord.equals("cybertekschool");
        boolean invalidPassWord = inpuUserName.endsWith("Cybertek") && ! inputPassWord.equals("cybertekschool");


        if (  !inputPassWord.isEmpty() && !inputPassWord.isEmpty() ){

        if ( logget){
            System.out.println("Logget in");
             }else if(invalidUserName){
            System.out.println("Pass is correct , Username is correct");
            }else if(invalidPassWord){
            System.out.println("Username is correct, password is incorrect");
            }else{
             System.out.println("Both username and password are incorrect");
            }

        }else {
            System.out.println(" please enter the credentials");
        }




    }
}
