package day05_Unary_ShorthandOperators;

public class PostPre {
    public static void main(String[] args) {

        //

        int Jake = 20;
        System.out.println(++Jake); // 21

        int b = 100;
        System.out.println( --b ); // 99

        // Post: B--    (Bank for example)

        int It = 5;

        System.out.println(It++);
        System.out.println(It);


        //----------------------------------------------
        int B = 100;
        System.out.println(B--);
        System.out.println("B: ====> + " +B);

        // post and pre

        int z = 10;
        int x = ++z;   //11

        System.out.println(x); // 11
        System.out.println(z); // 11

        int s = 10;
        int f = s++;  // 10,

        System.out.println(f);
        System.out.println(s);

        double t1 = 3.5;
        double t2 = t1--; // 3.5.   after line 42  :    2.5
        System.out.println(t1);


        int a = 50;//49
        int a1 = --a +  + a-- + a++; // 49 + 49 + 50 + 51
        System.out.println("a1= " + a1);
        System.out.println("a1= " + a1);



        int xa = 4;
        int y = xa*4 - xa++;    //16 - xa++    //  16-4=12
        System.out.println(y);

       /* int b = 1;
        b = -b--;


        int a5 = 1;//-2
        a5 = -a5--  + a5++  /  -a5-- * --a5;  // (-1 + -2)/ 2    *
        System.out.println(a5);
*/

        int b5 =1;
        b5  =  -b5--  + b5++  / -b5--  * --b5;
        //  -1   +  0  / - 1   *  -1
        // -1 + 0 * -1
        //  -1 + 0 = -1


    }
}
