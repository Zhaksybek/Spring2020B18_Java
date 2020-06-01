package day46_final_abstract;

public class final_Practices {

    final int a = 10;
    final static int b = 20;

    {
        System.out.println(a);
       // a = 20; // final can;t be reassigned
    }


    static {
        System.out.println(b);
       //  b = 30;
    }

    public final_Practices(){

    }

    public final void method1(){

    }

    public final static void method2(){

    }



}
