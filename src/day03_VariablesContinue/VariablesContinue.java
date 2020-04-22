package day03_VariablesContinue;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class VariablesContinue {
    public static void main(String[] args) {

        boolean result1 = true;
        boolean result2 = false;

        boolean result3 = 10 > 9 ;
        System.out.println(result3);

        System.out.println( true == false); //false

        System.out.println("Jake" == " Good Guy "); // false

        System.out.println("Jake" != "Amanzhol"); // true

        boolean r1 = true != true;  //false

        System.out.println(r1);  //false

        boolean r2 = "Batch 17" == "Batch 18";  // false

        System.out.println(r2);

        System.out.println("======================================================");

        char ch1 = 'A';
        System.out.println(ch1);  //A

        char ch2 = 45000;

        System.out.println(ch2);  //cant read number, only letter

        char ch3 = 25000;

        char ch4 = 100; //d
        System.out.println(ch4);

        char ch5 = 'D'; // 68
        System.out.println(ch5);

        int num1 = 'D';  // number
        System.out.println(num1);

        char a1 = 'z';
        // byte b1 = a1;   // char is larger than byte

        byte b1 = 'z';
        System.out.println(b1);

        //  short s1 = a1;  // char i larger than short

        int i1 = a1; // int is larger than char





    }
}
