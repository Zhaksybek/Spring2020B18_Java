package training_mine.WrapperClass;

public class UniqueValue {

    public static void main(String[] args) {
        String str="AABBCDEEE";
        String unique =   UniqueValue(str);
        System.out.println(unique);
    }


    public static String UniqueValue(String str){
                 //                 "AABBCDEEE" ==>"CD"
        String result="";

    for (int j=0;j<str.length();j++) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(j)) {
                count++;
            }
        }
        if (count == 1) {
            result += "" + str.charAt(j);
        }
    }//==> j

        return result;
    } //Unique


}//class
