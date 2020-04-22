package OfficeHours.practice_03_18_2020;

public class UnaryOperatos_Practice {
    public static void main(String[] args) {
        // post increase
        int a = 20;
        System.out.println(a++);//20

        int b = 30;
        int c = b--;  // c = 30; b=29;
        System.out.println(b);
        System.out.println(c);


        int d = 40;
        int e = d++;
        System.out.println(d); // e = 40;  d = 41;
        System.out.println(c);


        // pre inc and dec:
        //pre: changes value immediately
         int x = 200;
        System.out.println( --x );
        System.out.println(x);


        int z = 100;//101,   100,  99,  200
        z = z++ + --z + - z-- + ++z;
        // z= 100 + 100 - 100  + 100
        System.out.println(z);

        int u = 900;// 901, 902,  903
        int r = - ++u +  ++u +  -u++;
           //r = -901  + 902 + -902
        // r = 1 - 902 = -901
        System.out.println(r); // -901
        System.out.println(u); // 903


    }
}
