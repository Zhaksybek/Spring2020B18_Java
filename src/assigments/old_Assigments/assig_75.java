package assigments.old_Assigments;
import java.util.Scanner;
public class assig_75 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        String result ="";

        if (!word.contains("x") && !word.contains("X")){ //apple
            result=word;
        }else if ((word.substring(0,1).equals("X") && word.substring(word.length()-1).equals("X"))){//XgrapeX
            result = word.substring(1,word.length()-1);

        }else if ((word.substring(0,1).equals("x") && word.substring(word.length()-1).equals("x"))){  //xremedyx
            result = word.substring(1,word.length()-1);
        }

        else if (word.contains("x") && word.contains("X")){ //xHiX
            result = word.substring(1,word.length()-1);
        }else if (word.contains("x")){                       //xUxL
            result = word.substring(1);
        }else  if (word.contains("X")){                       //JavaX
            result = word.substring(0,word.length()-1);
        }

        System.out.println(result);


        /*   // if (word.contains()){
            result = word.replaceFirst("x","");
        }

        if (result.contains("X")){
            result= result.replace("X","");
        }
        System.out.println(result);
        */







    }
}
