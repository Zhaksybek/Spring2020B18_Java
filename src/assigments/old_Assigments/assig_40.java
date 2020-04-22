package assigments.old_Assigments;
import java.util.Scanner;
public class assig_40 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("what is the farthest planet in the solar system:" );
        System.out.println("a)venus" );
        System.out.println("b)pluto" );
        System.out.println("c)neptune" );

        String answer = s.nextLine();

        if (answer.equals("a")){
            System.out.println("a is wrong");
        }else if (answer.equals("b")){
            System.out.println("b is correct");
        }else if (answer.equals("c")){
            System.out.println("c is wrong");
        }else {
            System.out.println(answer+" is not a valid answer");
        }

        //System.out.println( str1.equalsIgnoreCase(str2) );


        /*
         String str1 ="CYBERTEK";
        String str2 = "cyBerTek";
        System.out.println( str1.equals(str2) );  //false
        System.out.println( str1.equalsIgnoreCase(str2) );
         */

    }
}
