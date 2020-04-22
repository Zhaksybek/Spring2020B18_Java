package day06_Shorthnd_LogicalOperators;

public class LogicalOperators {
    public static void main(String[] args) {

        boolean result1 = true;
        System.out.println(!result1); // false

        boolean result2 = !(10 +15 > 15);
        System.out.println(result2);

        boolean result3 = !true == !false;
                // result3 = false == true ==> false
        System.out.println(result3);


        //boolean R1 == "Corona" != "End of the world"  && "Large KZ"=="Cure" ;

        boolean R2 = 10 > 15 && 15 < 13;
        System.out.println(R2);


        boolean R3 = 'a' == 'b' -1 && 'b' +1 == 'c';
                //     97 == 98 - 1 && 98 + 1  ==>99


         boolean r4 = true != false  || false == !true;
                  //    true ||  true   ==> true
        System.out.println(r4);


        boolean r5 = true != false && !false == !true;
                     //    true && false ==> false

        System.out.println(r5);

        boolean r6 = !!!false;
                     // !!true
                     // !false
                     // true

        System.out.println(r6);


    }
}
