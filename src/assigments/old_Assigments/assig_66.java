package assigments.old_Assigments;
import java.util.*;
public class assig_66 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        //YOUR CODE HERE

        String result = "";
        if (word1.length() ==3 && word2.length()==3){
            result = ""+word1.charAt(0)  +word2.charAt(0) + word1.charAt(1)+ word2.charAt(1)
                    +word1.charAt(2)+word2.charAt(2);

        }else {
            result ="cannot merge";
            //aok
            //012
            //lol
            //012

        }
        System.out.println(result);



    }
}
