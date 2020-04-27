package assigments.Methods;

import java.util.Arrays;

public class As_195_ANAGRAM {
    public static void main(String[] args) {
       String s1 = "car";
       String s2 = "rac";
       boolean result ;

       if (s1.length() != s2.length()){
           result =false;
       }
       s1 =s1.toLowerCase();
       s2=s2.toLowerCase();

       char[] ch1 =s1.toCharArray();
       char[] ch2 =s2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        System.out.println(Arrays.toString(ch1));
        System.out.println(Arrays.toString(ch2));

        if (Arrays.equals(ch1,ch2)){
            result=true;
        }else {
            result=false;
        }
        System.out.println(result);





    }

    public static boolean isAnagram(String s1 , String s2)
    {
        String delStr="";
        String newStr="";

        for(int i=0;i<s1.length();i++)
        {
            for(int j=0 ; j < s2.length() ; j++)
            {
                if(s1.charAt(i)==s2.charAt(j))
                {
                    delStr=s1.substring(i,i+1);
                    newStr=s2.replace(delStr,"");
                }
            }
        }

        if(newStr.equals(""))
            return true;
        else
            return false;
    }
}
