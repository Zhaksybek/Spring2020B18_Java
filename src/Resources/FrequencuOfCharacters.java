package Resources;
import Resources.Library;
public class FrequencuOfCharacters {
    public static void main(String[] args) {
        String str = "AABBCC";   //A2B2C2
        String nonDup = Library.RemoveDuplicates(str);  //ABC

   String result = "";
    for (int i=0; i<nonDup.length();i++) {
        String ch = "" + nonDup.charAt(i);
        int num = Library.Frequency(str, ch);
        result += ch + num;
    }
        System.out.println(result);
        System.out.println("==================================");

        String FinalResult = Frequency(str);
        System.out.println(FinalResult);



    } //main

    public static String Frequency(String str){
        String nonDup = Library.RemoveDuplicates(str);  //ABC

        String result = "";
        for (int i=0; i<nonDup.length();i++) {
            String ch = "" + nonDup.charAt(i);
            int num = Library.Frequency(str, ch);
            result += ch + num;
        }
        return result;

    }



} //class
