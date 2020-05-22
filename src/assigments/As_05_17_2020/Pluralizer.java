package assigments.As_05_17_2020;

import java.util.Scanner;

public class Pluralizer {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("# in:");
        int amt = inp.nextInt();
        inp.nextLine(); //this line is necessary
        System.out.print("word:");
        String word = inp.nextLine();
        //leave the above unedited, write your code below:
        String result ="";
        /*
        # in:
        word:
        0 tries
         */

        if (amt<=1){
            if (word.endsWith("y")){
                result=result =amt+" "+word.substring(0,word.length()-1)   +"ies";
            }else {
                result = amt + " " + word;
            }
        }else if( word.endsWith("ay") || word.endsWith("oy") || word.endsWith("ey") || word.endsWith("uy") ){
            result =amt+" "+word+"s";
        }else if (word.endsWith("sh") || word.endsWith("ch") ){
            result = amt+" "+word+"es";
        }else if (word.endsWith("us") ){
            result = amt+" "+word.substring(0,word.length()-2)   +"i";
        }else if (word.endsWith("fe") ){
            result = amt+" "+word.substring(0,word.length()-2)   +"ves";
        }else if (word.endsWith("y") ){
            result = amt+" "+word.substring(0,word.length()-1)   +"ies";
        }else {
            result = amt+" "+word+"s";
        }
        System.out.println(result);

    }
}
