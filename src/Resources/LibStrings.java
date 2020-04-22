package Resources;

public class LibStrings {

    public static String Revers(String str){
        /* for MAIN
         String sentences ="I will be best developer in Bay Area";
    String newRev = Revers(sentences);
        System.out.println(newRev);

         */
        String Revers ="";
        for (int i=str.length()-1; i>=0; i--){
            Revers += str.charAt(i);
        }
        return Revers;
    }

    public static String RemoveDup(String str){
        String nonDup ="";
        /*
        FIRST METHOD WITH SUBSTRING
        for (int i=0; i<str.length(); i++){
            if (!nonDup.contains(str.substring(i,i+1))){
                nonDup +=str.substring(i,i+1);
            }
        }
        ------------------------------------------------------
        SECOND METHOD ==> CharAT
        String str ="AAABBBCC";
        String nonDup = "";

        for (int i=1;i<str.length();i++){
            if(!nonDup.contains(str.substring(i,i+1))){
                nonDup+=str.substring(i,i+1);
            }
        }
         //System.out.println(nonDup);  //ABC
         -------------------------------------------------------------
        */
        // THIRD METHOD ==>  charAt()
        for (int i=0; i<str.length(); i++){
            if(!nonDup.contains(""+str.charAt(i))){
                nonDup+=str.charAt(i);
            }
        }
        return nonDup;
    }

    public static String Frequency(String str){
        String nonDup ="";
        for (int i=0; i<str.length(); i++){
            if (!nonDup.contains(str.substring(i,i+1))){
                nonDup +=str.substring(i,i+1);
            }
        }

        String resultFinal="";
        for (int j=0; j<nonDup.length();j++) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.substring(i, i + 1).equals(nonDup.substring(j,j+ 1))) {
                    count++;
                }
            }
            resultFinal += nonDup.substring(j,j + 1) + count;
        }
        return resultFinal;
    }

    public static String Unique(String str){
        String result="";

    for (int j=0; j<str.length(); j++) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.substring(i, i + 1).equals(str.substring(j,j+ 1))) {
                count++;
            }
        }
        if (count == 1) {
            result += str.substring(j,j+ 1);
        }
    }
    return result;
    //UNIQUE with charAt()
    /*   String result = ""; // B


    for (int j=0; j<str.length();j++) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == str.charAt(j)) {
                count++;
            }
        }
        if (count == 1) {
            result += str.charAt(j);
        }

    }
        System.out.println(result);

      */


    }



}// class
