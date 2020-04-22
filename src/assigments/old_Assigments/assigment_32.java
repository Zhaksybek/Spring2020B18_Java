package assigments.old_Assigments;
import java.util.Scanner;
public class assigment_32 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int inputSeconds = scan.nextInt();
        int hours, minutes, seconds;

        System.out.println("Enter seconds:");
        int remainderSec = inputSeconds%60; //35 sec
        int secondToMin = (inputSeconds/60)%60;// 1 min
        int secondTohour = inputSeconds/3600;

        System.out.println(secondTohour + " hours, "+
                secondToMin+" minutes, and "+
                remainderSec + " seconds");

      /*  System.out.println(secondToMin);

        System.out.println(remainderSec);
        int SecondToMin = inputSeconds- (inputSeconds/60) ;
*/





    }
}
