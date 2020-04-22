package OfficeHours.practice_03_18_2020;

public class ShortHandOperatos {
    public static void main(String[] args) {

        int a = 100;
        // a = a + 200;
        a += 200;
        System.out.println(a); //300

        a +=200*3; //600
        System.out.println(a); //900

        // -= substraction assigment
        // a = a - 400;
        a -= 400; // a =500;
        System.out.println(a);// 500

        int b = 300;
        b -= 3*40; //300 - 120 = 180




        // *=: multipcation assigment
        int x = 5;
            //x = x*3; // 15
           x *=3; // 15
        System.out.println(x);//15

        x *= 2+1; //45
        System.out.println(x);


        //   /=:  division assigment:

        int n = 900;
        // n = n/3;
        n /= 3; //300
        System.out.println(n);

        n /= 3 * 5;  // 20
        System.out.println(n);


        // %=: remainder assigment
            // remainder-(denominator * whole Number for result)
                     // 10/3 = 3.3333

        int m = 10;
        //m = m %3; //1
        m %=3;
        System.out.println(m);

        int y = 300;
        y %= 3*15;
        // y %= 15; y ==>0 (remainder)

        int t = 400;
        t %= 10*2;
         // t %= 20 ==> t= 400 % 200 ==> 0 (no remainder)
        System.out.println(t);





    }
}
