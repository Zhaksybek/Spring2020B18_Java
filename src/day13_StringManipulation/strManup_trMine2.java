package day13_StringManipulation;

public class strManup_trMine2 {
    public static void main(String[] args) {

        String str = "Java is easy";
                str =  str.concat( " programming language");
         int maxIndex1 = str.length()-1;
        System.out.println(maxIndex1);
        System.out.println(str);

        String str1 = "We need to do";
               str1= str1.concat(" more practice");
        int maxIndex = str1.length()-1;
        System.out.println(maxIndex);
        System.out.println(str1);

        int maxIndex3 = (str.length()-1) + (str1.length()-1);
        System.out.println("str + str1 Max Index is: " + maxIndex3);


        String str2 = "ALABAMA STATE";
               str2 = str2.toLowerCase();
        System.out.println(str2);

        String str3 = "19_COVID---19 VIRUS is DaNgErOuS";
                str3 = str3.toLowerCase();
        System.out.println(str3);

        String newStr = "i bought car from texas austin";
               newStr = newStr.toUpperCase();
        System.out.println(newStr);

        String newStr2 = "My goal is create  my own buisness in America";
               newStr2 = newStr2.toUpperCase();
        System.out.println(newStr2);

        newStr2 = newStr2.toLowerCase();
        String newStr3 = newStr2.toUpperCase();
        String concate = "To lower case again: "    + newStr3.toLowerCase()+"\n"+"To upper case again: "+
                newStr2.toUpperCase();

        System.out.println(concate);
        //System.out.println("To lower case again: "+newStr2 + "\n"+"To upper case again: "+newStr3);












    }
}
