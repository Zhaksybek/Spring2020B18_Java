package day13_StringManipulation;

public class stringManipulation3 {
    public static void main(String[] args) {

        // indexOf():

        String str = "I like Java programming Jake";
                  int num1 = str.indexOf("Jake"); // 7
        System.out.println(num1);




        String str2 = "Cybertek school is awesome";

        int first = str2.indexOf("s");   //s==>9
        int second  = str2.indexOf("is")+1;
        System.out.println(first);
        System.out.println(second);

        int maxIndexNumber = "Cybertek".length() - 1; // 8-1==> 7
        System.out.println(maxIndexNumber);


        String names = "Zhaksybek";
             int a1 =    names.indexOf("Good Guy");



    }
}
