package training_mine.METHODS;

public class NonDup_char {
    public static void main(String[] args) {

        String str= "ABAB";

        String result = "";

        for (int i=0; i< str.length(); i++){
            char ch = str.charAt(i); // A  B  A  A B ==> i step by step will check all of them
            if ( ! result.contains("" + ch)){
                result +=ch;
            }
        }
        System.out.println(result);



    } // main



} //class
