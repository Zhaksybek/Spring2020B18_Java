package day06_Shorthnd_LogicalOperators;

public class Mine_LogicalOperators {
    public static void main(String[] args) {

     /*  int a= 10, b = 1;
            System.out.println("Var 'a' = " + a);
            System.out.println("Var 'b' = " + b);

            System.out.println("!(a<b) = "+ (a<b));
            System.out.println("!(a>b) = " + (a > b)); */

     String name = "Akerke";
     int wasborn = 1995;
     int currentYear = 2020;
     int yearFuture = 2050;
     int howOld = currentYear - wasborn;
     int howOldFuture = yearFuture - wasborn;
            System.out.println(name+" "+yearFuture+" year will be: "+ howOldFuture);
            System.out.println(name+"'s"+" current year is: " + howOld );


        }
    }




       /*   float hourOfDay = 6f;

      if(hourOfDay<11){
            System.out.println("Time is: "+hourOfDay+  "AM Good morning ");
        } else if(hourOfDay<15){
            System.out.println("Time is: "+hourOfDay+ "PM Good afternoon");
        } else {
            System.out.println("Time is: "+hourOfDay+ "PM Good evning");
        }
*/



         // &&   if both parts true ==>true // 10>9 && 9<12     ==>true
        //  if    first part true but second part throng     78>45 && 3<2     ==> false

        /*   int x = 20;
            if (x >0 ){
                System.out.println("x is posititive");
            }
  /*
  quotient = dividend / divisor;
remainder = dividend % divisor;
  * */
      /*int dividend = -756;
      int divisior = 8;

      int remainderGen =     (dividend/divisior);

      int quotient = dividend/divisior;
      int remainder = dividend % divisior;

        System.out.println("The Quptent is = " + quotient);
        System.out.println("The Remainder is = " + remainder);*/

        /* int a = 5;
        int b = 200;
        int c = 20;



        System.out.println("Var 'a' = " + a);
        System.out.println("Var 'b' = " + b);
        System.out.println("Var 'c' = " +c);



        if ((a<b) || (b ==c) ){
            int d = a+b+c;
            System.out.println("One or both con is true " + d);   }   */



      /* int a =10;
       int b = 20;
       int c = 20;
       int d = 0;
        System.out.println("Vara = " + a);
        System.out.println("Varb = " + b);
        System.out.println("Varc = " +c);

        if(  a<b && b==c);{
            d = a + b + c;
            System.out.println("The sum is: " + d);
        }
        //else;
        System.out.println("False conditions"); */







