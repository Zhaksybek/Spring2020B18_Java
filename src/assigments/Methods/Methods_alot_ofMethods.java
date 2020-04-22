package assigments.Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Methods_alot_ofMethods {
    public static void main(String[] args) {
Calculation(10,2,"+");




    } // main method









    public static void Calculation(double a, double b,String str){
/*
3. write a method called Calculation, that can accepts 3 parameters: 2 numbers and one operator, and prints out the calculation
		if operator is not between [-, +, *, /, %] output should be Invalid Operator
		Ex: calculate(10, 2, "*") ==> 20;
		Calculation(10,2,"+");
 */

       if (str.equals("-")){
           System.out.println("num1 - num2 = "+ ( a-b));
       }else if (str.equals("+")){
            System.out.println("num1 + num2 = "+ ( a+b));
        }else if (str.equals("*")){
           System.out.println("num1 * num2 = "+ ( a*b));
       }else if (str.equals("/")){
           System.out.println("num1 / num2 = "+ ( a/b));
       }else if (str.equals("%")){
           System.out.println("num1 % num2 = "+ ( a%b));
       }else {
           System.out.println("Invalid");
       }




    }




      public static void GalonsToLitters(int g){

        /*
        2. write a method called GalonsToLitters, that can convert gallons to litters
	 			   1 G = 3.75 L
         */
          DecimalFormat DF = new DecimalFormat("0.00");
          double liter = g/0.26417;
          System.out.println(g+" Gallon is: => "+DF.format(liter)+" liters");




    }





    public static void KmToMiles(int km){
/*
1. write a method called KmToMiles that can convert km to miles
	 				1 km = 0.612 miles
 */

        double mile= km*0.621;
        System.out.println(km+" km is: "+mile+" mile");


    }



    public static void next3(int n){
        System.out.println((n+1) + " "+(n+2)+" "+(n+3));

    }







    public static void person(String info)
    {

        //your code here


        String[] arr =  info.split(",");

        System.out.println("person name: "+arr[0]+" last name: "+arr[1]+" age: "+arr[2]);



    }//end person



    public static void plus_minus(int[] arr){

        int countPos=0;
        int countNeg=0;
        int countZero=0;

        for (int i=0; i<arr.length; i++){
            if (arr[i]>0){
                countPos++;
            }else if (arr[i]<0){
                countNeg++;
            }else if (arr[i]==0){
                countZero++;
            }


        }

        System.out.println("positives: "+countPos+", negatives: "+countNeg+", zeros: "+countZero);
    }



    public static void sign(int n) {
        //your code here
        Scanner scan = new Scanner(System.in);
        int num =scan.nextInt();
        if (n>0){
            System.out.println(1);
        }else if (n==0){
            System.out.println(0);
        }else {
            System.out.println(-1);
        }



    }//end sign




    public static void printHollowRect(){
        // write your code here:

        System.out.println("*****");
        System.out.println("*   *");
        System.out.println("*   *");
        System.out.println("*   *");
        System.out.println("*****");

    }// end your code




    public static void hello(){
        //WRITE YOUR CODE HERE
        System.out.print("Hello ");
    }

    public static void world(){
        //WRITE YOUR CODE HERE
        System.out.println("World!");
    }




    public static void cube()
    {
        //your code here
        Scanner scan = new Scanner(System.in);
        int cube =scan.nextInt();
        int result = (int) Math.pow(cube, 3);
        System.out.println(result);



    }//end cube





    public static void plus(){

        //your code here
        Scanner scan = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 =scan.nextInt();
        System.out.println("enter second number");
        int num2 = scan.nextInt();

        System.out.println("result: " + (num1+num2));


    }



}
