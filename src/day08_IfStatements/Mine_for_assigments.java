package day08_IfStatements;

public class Mine_for_assigments {
    public static void main(String[] args) {


        int num1 = 14;
        int num2=52;
        int num3=25;

        //WRITE YOUR CODE HERE
        boolean num1Medium =(num2<num1&&num1<num3)||(num3<num1&&num1<num2);
        boolean num2Medium= (num1<num2&&num2<num3)||(num3<num2&&num2<num1);
        boolean num3Medium=(num2<num3&&num3<num1)||(num1<num3&&num3<num2);

        if(num1Medium){
            System.out.println("Enter first number:");
            System.out.println("Enter second number:");
            System.out.println("Enter third number:");
            System.out.println("Medium value is: "+num1);

        }
        else  if(num2Medium){
            System.out.println("Enter first number:");
            System.out.println("Enter second number:");
            System.out.println("Enter third number:");
            System.out.println("Medium value is: "+num2);

        }
        else if (num3Medium){
            System.out.println("Enter first number:");
            System.out.println("Enter second number:");
            System.out.println("Enter third number:");
            System.out.println("Medium value is: "+num3);


        }






    }}




