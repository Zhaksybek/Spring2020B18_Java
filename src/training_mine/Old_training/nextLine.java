package training_mine.Old_training;
import java.util.Scanner;
public class nextLine {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name:");

        String fullName = scan.nextLine(); // ==> When two and more words;  exp:  (I am working in Google company)

        System.out.println("Enter your first name");
        String fistName = scan.next();         // if you will write two words exp: Aigerim Ibraimova
                                               // scan.next(); will take just: ==>"Aigerim"



    }
}
