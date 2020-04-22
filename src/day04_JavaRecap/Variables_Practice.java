package day04_JavaRecap;

public class Variables_Practice {
    public static void main(String[] args) {

        // DataType   variableName = Data;

        byte num1 = 127;
        short num2 = num1; // byte<short < int < long < float < double

        int num4 = num2;

        long num5 = 99999999999999999l;

        float num6 = 100L;
        System.out.println(num6);

        float num7 = 0.5f;
        System.out.println(num7);

        double num8 = 0.5f;
        double num9 = 999999999999L;
        double num10 = 100.5;

        System.out.println(num10);

        char ch1 = '$'; // every single character has a corresponding number
        System.out.println(ch1);   // $

        char ch2 = 114; //r
        System.out.println(ch2);

        int a1 = '8';  // character
        System.out.println(a1);   // 56

        int a2 = 'z';  // character
        System.out.println(a2);  // 122

        double d1 = 'z' + '8';    // 178.0
        System.out.println(d1);

        char ch4 = 'z' + '8';
        System.out.println(ch4);
        //--------------------------------------------------------------

        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println( 9 > 10); //false

        System.out.println(9>=9); // true
        System.out.println(9 != 10);  // true

        System.out.println('a' == 'b');  // false

        System.out.println( 'a' == 'b'); // false

        //System.out.println('a' == "a");  does not match

        System.out.println('a' == 'b'-1 );    // 97 == 98 - 1

        //--------------------------------------------------------------

        boolean r1 = !true;  // false




    }
}
