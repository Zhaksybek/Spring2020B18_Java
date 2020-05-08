package assigments.As_05_07_2020;
import java.util.Scanner;

public class Conditional_Statement {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        //System.out.print("In:");
      //  String word = "softy";
       // String word = "softey";
        //String word = "softife";
        String word = "softifedddd";
        //DO NOT CHANGE ABOVE CODE!  Write your code below

        if (word.substring(word.length()-2).equals("ey")){
            System.out.println("-eys");
        }else if (word.substring(word.length()-1).equals("y")){
            System.out.println("-ies");
        }else if (word.substring(word.length()-3).equals("ife")){
            System.out.println("-ives");
        }else {
            System.out.println("-s");
        }


    }


}
