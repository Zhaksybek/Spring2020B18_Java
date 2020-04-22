package assigments.ArraysClassAssigments;
import java.util.Scanner;
public class As_115_longestWord {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] words = new String[5];
        for(int i = 0; i < 5;  i++) {
            words[i] = input.nextLine();
        }


        int max = words[0].length();
        String result="";


        for (int i=0; i < words.length; i++){
            if(words[i].length() >= max) {  // array's index are compared with each other, and whichever is greater will be assigned to the max
                max = words[i].length();
                result =words[i];
            }
    }
        System.out.println(result);





}
}
