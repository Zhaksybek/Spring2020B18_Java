package assigments.old_Assigments;
import java.util.Scanner;
public class assig_67 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //WRITE YOUR CODE HERE
        int maxInOf = word.length()-1;//4
        String result = "";
        if (word.length()==5){  //apple
                                //01234
            for (int i =maxInOf; i>=0; i-- ){
                result += word.charAt(i);
            }


        }else if (word.length()>5){
            System.out.println("Too long!");
        }else if (word.length()<5){
            System.out.println("Too short!");
        }
        System.out.println(result);



    }
}
