package training_mine.WrapperClass_ArrayListMine;

public class Parce_method {
    public static void main(String[] args) {

        // parse method: converts String value to primitives
         // parseInt("atrValue"): takes the String and converts the string to
        String str =  "123";

              Integer num1 = Integer.parseInt("123");  // primitive to Wrapper class auto boxing

              System.out.println(num1+1);

              int num2 = Integer.parseInt("125"); // none boxing
              System.out.println(num2 + num1);


              // parseByte("strValue"): takse the string and converts the string value to

               int num3 = Byte.parseByte("126");

               System.out.println(num3 +1);

               Byte num4 = Byte.parseByte("18");    //   Auto Boxing

               System.out.println(num4+1);

               // parseShort("strValue"): takes the string

                  short num5 =  Short.parseShort("200");

                 System.out.println(num5);

                 Short num6= Short.parseShort("200");

                 System.out.println(num6+1);

            // parseLong("strValue"): take string value and coverts to primitive

            int num7 = (int) Long.parseLong("1222");
            long num8 = Long.parseLong("1222");
            System.out.println(num7);
            System.out.println(num8);


            // parseFloat("AtrValue"): takes str value convert it to float primitive

            float num9 =  Float.parseFloat("12.5");  // none boxing

            System.out.println(num9 + 1);

            Float num10 = Float.parseFloat("12.5");  // Auto - boxing
            System.out.println(num10 + 1);

            // parseDouble ("StrValue"): takes str value converts ot to double primitive
                      double num11 =  Double.parseDouble("8.5"); // none boxing
                     Double num12 = Double.parseDouble("8.5"); // Auto boxing

                      System.out.println(num11);
                      System.out.println(num12);

            // parseBoolean("StrValue"): takes str value and converts to boolean primitive

             boolean A = Boolean.parseBoolean("CybertekBatch12");  // none boxing
                    // any values other than true will return false

            System.out.println(A);

            boolean B = Boolean.parseBoolean("TrUe");   //ignored case sensitive

           System.out.println(B);



           //==================================================================

        int a = 10;
        double b = a;

        // Double c =a;  Double wrapper class is only Dedicated to double primitive

        int A1 = Byte.parseByte("19");
        Integer A2 = (int)Byte.parseByte("19");

                Short A3 = (short) Double.parseDouble("10.9");

















    }
}
