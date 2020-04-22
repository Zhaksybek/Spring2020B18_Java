package day13_StringManipulation;

public class StrLiteralsTrainingMine {
    public static void main(String[] args) {
/*
                       1.  String literals:
						String str1 = "Muhtar";
 */

        String str1 = "Zhaksybek";   //   when you create regular string with similar name
                                      //  they are equal and will save in one place str1 == str3
        String str3 = "Zhaksybek";   // ==>    String pool

        //              2. new keyword:                                         (str1 != str2)
        String str2 = new String("Zhaksybek"); // new String:==> will create new place

        System.out.println(str1 == str2);



    }
}
