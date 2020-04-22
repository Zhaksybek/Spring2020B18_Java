package day06_Shorthnd_LogicalOperators;
//WARM UP TASKS
public class WarmUp {
    public static void main(String[] args) {
     double numberofGallons = 12;
     double gallonsToLiters = numberofGallons* 3.785;
     String result = numberofGallons + " gallons is equal to: " + gallonsToLiters + " liters";

        System.out.println(result);

      double kilogramm = 65;
      double powndToKg = kilogramm/0.4535;
        System.out.println("Pown to kg: " + powndToKg);

        double pownd = 136;
        double kgToPownd = pownd/2.205;
        System.out.println("Your weight in kg is: " + kgToPownd);


        System.out.println("==========================================================");

        double numberOfLiters = 40;
        double litersToGalons = numberOfLiters / 3.785;
        String result1 = numberOfLiters + " liters equal to " + litersToGalons+" galons";
        System.out.println(result1);

        System.out.println("==========================================================");

        int a = 200;// 1->200   2-->201   -
        int b = -a++ + - --a * a-- %2;
       //b= -200 + - 200 * 200 % 2;
        // b = -200 + (-40000) % 2;
        // b = -200 + 0;

       System.out.println(b);
        System.out.println(a);

        int aa = 1;//1
        aa =-aa-- + aa++ / -aa-- * --aa; // -1 + 0/1 * 0;
        System.out.println("BAIAGY: " +  aa);

        int x = 300;
        int y = 400;
        int z = x + y - x * y +x / y;
        // z = 300+ 400 - 300*400 + 300/400
        //z = 700 - 120000 + 3/4
        // z = 119300 + 3/4
        System.out.println(z);

        int x1 = 400;//400
        int b1 = -x1++ + - --x1 * x1-- %2;
        // b1 = -400 + - 400 * 399 % 2;
        // b1 = -400 - 159600%2;
        // b1 = -401
        System.out.println("B:==> " + b1);

        //int b = 6; //4
        //b = -b-- + b++ / -b-- * --b; //b=-6 + -5 / 4 * 3
                                      // -2
       // System.out.println(b);


        int q = 28;//27
        q= --q + q++ + q-- + q++;   //27 + 27 +27 + 28
        System.out.println("BAIAGY2:  " + q);

        int w = 4;
        int Y = w * 4 - w++ - w++; //16 - 4 - 5 ==> 7
        System.out.println("MYSALY: "  + Y);


    }
}


/*
package name: day06_Shorthnd_LogicalOperators
class name: warmUp
warmup task:
    1. write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785

    2. write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    3. manually calculate the following code fragements:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?
                2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y;

 */