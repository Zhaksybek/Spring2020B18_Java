package training_mine.WrapperClass_ArrayListMine;

import java.util.Arrays;

public class WrapperClass {
    /*
    primitives                   wrapper-class
    byte        Auto Boxing      Byte
    short       ===========>>>   Short
    int                          Integer
    long           unboxing      Long
    float      <<=============   Float
    double                       Double
    boolean                      Boolean
    char                         Character
     */

    public static void main(String[] args) {
        int numInt = 10;
        Integer numInteger = 10;

        double numdouble = 5.5;
        Double numDouble = 5.5;

        long longNum =20L;
        Long LongNum = longNum;  // Auto-Boxing (convert primitive to Wrapper Class )

        System.out.println(longNum);
        System.out.println(LongNum);

        Boolean BooleanResult = false;
        boolean booleanResult = BooleanResult; // un boxing  (convert Wrapper class value to primitives )

        Integer[] arr = new Integer[5];
        System.out.println(Arrays.toString(arr));  //[null, null, null, null, null]

        Integer num2 = 20;

    }




}
