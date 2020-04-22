package assigments.old_Assigments;
import java.util.*;
public class assig_63 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        //YOUR CODE HERE

        //javav    maxIn==>5
        //01234

        int indexOfOddNum = word.length();  // 5     5%2 =1 odd

       /* if (word.length()==1){
            System.out.println(word+word+word);
        }else if(word.length()==2){
            System.out.println(word+word);
        }else
        */

       if (indexOfOddNum>=5 && indexOfOddNum%2 !=0){

            //javav  //5
           // 01234  ==>v
            // 5/2 = 2
            // 3/2 =1
           char ch1 = word.charAt(indexOfOddNum/2-1);
           char ch2 = word.charAt(indexOfOddNum/2);

           char ch3 = word.charAt(indexOfOddNum/2+1);
            System.out.println(ch1 +""+ch2+""+ch3);

        }
/*
            if (indexOfOddNum>=5 && indexOfOddNum%2 ==0){
            // java  4/2= 2
            // 0123
            String ch2 = word.charAt(indexOfOddNum/2 - 1) +""+word.charAt(indexOfOddNum/2);
            System.out.println(ch2);
        }*/




    }
}
