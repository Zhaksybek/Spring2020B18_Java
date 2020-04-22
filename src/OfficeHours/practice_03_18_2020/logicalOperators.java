package OfficeHours.practice_03_18_2020;

public class logicalOperators {
    public static void main(String[] args) {
        // ||, &&, !
        boolean r1 = "Jaksybek" == "Bad Guy";  //false
        System.out.println(r1);

        boolean r2 = "Jaksybek" != "Good guy!"; // true
        System.out.println(r2);

        boolean r3 = 10 >= 9 ; //true
        System.out.println(r3);

        boolean r4 = !false == !true; // false
        System.out.println(r4);


        //    ||: or logic is ==> as long as one condotion is true ==> true

        boolean result1 = 9 != 8 || 9 == 8;  // true || false    ==> true
        System.out.println(result1);

        boolean result2 = 'a' == 'A' || 'A'== 'b';
               // result = false || false   ==>  false
        System.out.println("result2 = " + result2);

        // &&:
        boolean result3 = 77 != 88 && 6 < 4;
           // true && false   ==> false
        System.out.println(result3);


        boolean result4 = !false != false && !true == false;
                       // true != false && false == false
                       // true && true    ==> true
        System.out.println(result4);


    }
}
