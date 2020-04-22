package day06_Shorthnd_LogicalOperators;

public class Mine_shorthand {
    public static void main(String[] args) {

        float A = 10.28f;
        int B = 2;
        A /= B;
        System.out.println(A);//5.28

        A %= (int)B;

        System.out.println(A);


        int x=20;
        int y = 3;
        x %= y;
        System.out.println(x);

        String myLastName = "Satylgan";
        String myFirstName = " Zhaksybek";
        myLastName += myFirstName;
        System.out.println(myLastName);
        myLastName +=" " + 1993;
        System.out.println(myLastName);

        byte a =30;
        int b=0;
        b +=a;
        System.out.println(b);








    }

}
