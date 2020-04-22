package assigments.old_Assigments;
import java.util.Scanner;
public class assi_76 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String start = scan.next();
        String end = scan.next();

        if (start.equals(end)||end.equals(start)){
            System.out.println(start+ " found");
        }else  if (start.equals("C") &&end.equals("B")) {
            System.out.println("left > up > right: B found");


        }else  if (start.equals("D")&&end.equals("B")) {
            System.out.println("up > right: B found");
        }
              //C  B       //left > up > right > down > left > up > right > down : B found
        //                  C----->D--->A------>B----->
        //                  C----->D--->A------B----->C
             //  up A right > B down > C left D > up > A

        }
}
