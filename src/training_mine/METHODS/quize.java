package training_mine.METHODS;
import Resources.Library;
public class quize {
    public static void main(String[] args) {

        String str="AABBCC"; //A2B2C2
                             //ABC
        String nonDup = Library.RemoveDuplicates(str);  //ABC

    for (int i=0; i<nonDup.length();i++) {
        String ch = "" + nonDup.charAt(i); // "A"
        int num = Library.Frequency(str, ch);
        System.out.print(ch + num);
    }
        System.out.println();

        System.out.println("========================================");

    String  frequency=FrequencyOfChar(str);
        System.out.println(frequency);









         } //main

    public static String FrequencyOfChar(String str){
        String nonDup = Library.RemoveDuplicates(str);  //ABC
        String result ="";
        for (int i=0; i<nonDup.length();i++) {
            String ch = "" + nonDup.charAt(i); // "A"
            int num = Library.Frequency(str, ch);
            result += ch + num;
        }
        return result;

    }



    }//clas

