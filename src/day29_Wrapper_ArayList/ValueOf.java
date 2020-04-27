package day29_Wrapper_ArayList;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ValueOf {
    public static void main(String[] args) {

        String str = "123";

        Integer a = Integer.valueOf(str);  // Integer, 123

        System.out.println(a);

        double b = Integer.valueOf(str);   // unboxing
        // double =Integer

        System.out.println(b);


        String str2 = "15.5";

        double d1 = Double.parseDouble(str2);

        System.out.println("====================================================");

        int z1 = 2000;
        // Long L1 = z1;  // does not accept any other primitive except for long

        Short sh1 = 3000;
        int z2 = sh1;

        String str3 ="True";
         boolean bool1 =  Boolean.parseBoolean(str3);
        Boolean Bool1 = Boolean.valueOf(str3);
        System.out.println(Bool1);
        System.out.println(bool1);

        String r1 = "true";
         Boolean t1 =   Boolean.valueOf(r1);  // Boolean, true
                //  Boolean = Boolean  // none

        boolean t2 = Boolean.valueOf(r1);
        // boolean = Boolean   // unboxing

        System.out.println(t1);
        System.out.println(t2);

        System.out.println("========================================================");

        int maxNum = Integer.MAX_VALUE;
        System.out.println(maxNum); // 2147483647

        double maxNum2 = Double.MAX_VALUE;
        System.out.println(maxNum2);     // 1.7976931348623157E308

        int minNum = Integer.MIN_VALUE;

        System.out.println(minNum);   // -2147483648


        byte maxByte = Byte.MAX_VALUE;
        System.out.println(maxByte);  // 127

        byte minByte = Byte.MIN_VALUE;
        System.out.println(minByte);   // -128


        System.out.println("============================================");

        int[] arr = new int[3];
        System.out.println(Arrays.toString(arr));    // [0, 0, 0]

        boolean[] arr2 = new boolean[3];
        System.out.println(Arrays.toString(arr2));    // [false, false, false]

        Integer[] arr3 = new Integer[3];
        System.out.println(Arrays.toString(arr3));   //[null, null, null]  All Wrapper classes







    }
}
