package day35_Static;

public class staticMethods {

    int a = 100;

    static int b =200;


    public static void main(String[] args) {

      //   System.out.println(a); Error


        staticMethods obj1 = new staticMethods();

        System.out.println(obj1.a);


        System.out.println("==========>> Static <<==========================");

        System.out.println(b);

        System.out.println(staticMethods.b);

        System.out.println(obj1.b); // prefers to be called through class name


    }


    public void method(){
        System.out.println(a);
        System.out.println(b);
    }





}
