package assigments.old_Assigments;
import java.util.Scanner;
public class assigment_54 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter month number");
        byte day = scan.nextByte();

        String month=(day==1)?"January":(day==2)?"February":(day==3)?"March":(day==4)?"April"
                :(day==5)?"May":(day==6)?"June":(day==7)?"July":(day==8)?"August":(day==10)?"October"
                :(day==11)?"November":(day==12)?"December":"September";

        System.out.println(month);


    }
}
