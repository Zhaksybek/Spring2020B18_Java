package day23_methods;

public class regularMethod {
    public static void main(String[] args) {

        String str = "AnyaDatsko";
        //            0123456789
        String reversName = "";

        for (int i=str.length()-1;  i>=0;   i-- ){

            reversName += str.charAt(i);

        }

        System.out.println(reversName);

       // for (int i=0; i < str.length()  /* ==>9 */;    )

        System.out.println("==================");

        String string2 = "godBlessAmerica";

        String revers = reversName1(string2);

        System.out.println(revers);




    }



    public static String reversName1(String string1 ){
        // str

        String result ="";

        for (int i=string1.length()-1; i>=0; i--   ){
            result+=string1.charAt(i);
        }
        return result;


    }





}
