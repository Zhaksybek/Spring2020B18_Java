package training_mine.METHODS;

public class Frequency_Muhtar {
    public static void main(String[] args) {

        String str  ="AAA";
        String str2 ="A";

        int count = 0;

        while (str.contains(str2)){
            count++;
            str = str.replaceFirst("A","");
            // we need to make sure we are not counting the same index again
        }

        System.out.println(str);
        System.out.println(count);


        /*
        Its old version ==>

        String nonDup = "";

        for (int i=1;i<str.length();i++){
            if(!nonDup.contains(str.substring(i,i+1))){
                nonDup+=str.substring(i,i+1);
            }
        }
         //System.out.println(nonDup);  //ABC

        String result="";


    for (int i=0; i<nonDup.length();i++) {
        int count=0;
        for (int j = 0; j < str.length(); j++) {
            if (str.substring(j, j + 1).equals(nonDup.substring(i,i+ 1))) {
                count++;
            }
        }
        result += nonDup.substring(i,i+ 1) + count;
    }

        System.out.println(result);

*/

    }   // main

    public static int Frequency(String str1, String str2){
        int count = 0;

        while (str1.contains(str2)){
            count++;
            str1 = str1.replaceFirst("A","");
            // we need to make sure we are not counting the same index again
        }
        return count;
    }


} //class
