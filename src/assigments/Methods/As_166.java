package assigments.Methods;

public class As_166 {
    public static void main(String[] args) {
        String s1 = "java";         //"12345"
        String s2 = "selenium";    //"abcde"
         //          jsaevlae     //"1a2b3c4d5e"
        String S1="";

        if (s1.length()>s2.length()){
            S1 = s1.substring(s2.length());
            s1=s1.substring(0,s2.length());
        }else if (s1.length()<s2.length()){
            S1=s2.substring(s1.length());
            s2 = s2.substring(0,s1.length());
        }

        String result="";
        for (int j=0; j < s1.length(); j++) {
            char ch =  s1.charAt(j);
            char ch2 =  s2.charAt(j);
            result += "" + ch + ch2;


        }//main for(j)

        System.out.println(result + S1);  //==> 1e2e3e4e5e    ==>wsopoodoenn

        System.out.println(mergeStrings(s1,s2));






    }
    public static String mergeStrings(String one, String two) {
        String S1="";

        if (one.length()>two.length()){
            S1 = one.substring(two.length());
            one=one.substring(0,two.length());
        }else if (one.length()<two.length()){
            S1=two.substring(one.length());
            two = two.substring(0,one.length());
        }

        String result="";
        for (int j=0; j < one.length(); j++) {
            char ch =  one.charAt(j);
            char ch2 =  two.charAt(j);
            result += "" + ch + ch2;


        }

        return  result +""+ S1;


    }


}
