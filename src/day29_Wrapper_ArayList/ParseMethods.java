package day29_Wrapper_ArayList;

public class ParseMethods {
    public static void main(String[] args) {

        String str = "123";

         int a1 = Integer.parseInt(str);   // 123

        System.out.println(str+1);
        System.out.println(a1-1);

        byte b1 = Byte.parseByte(str);  // byte = 123

        System.out.println(b1+5);

        String str2 ="10.5";

          float f1 = Float.parseFloat(str2);  //  float 10.5

        System.out.println(f1);

        double f2  =  Double.parseDouble(str2);

        System.out.println( f2 + 1 ); // 13.5

        String str3 = "3147483647";

        long num1 = Long.parseLong(str3);    //    3147483647

        System.out.println( num1 +2 );

        String result1 = "True";

         boolean bool1 =  Boolean.parseBoolean(result1);   // boolean  ==>true  (Not case sensitive)
        System.out.println(bool1);








    }
}
