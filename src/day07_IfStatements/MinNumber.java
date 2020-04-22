package day07_IfStatements;
/*
 write a java program that accepts three numbers and return the minimum number
				(assume that none of them are equal)
 */
public class MinNumber {
    public static void main(String[] args) {
        double a = 400.5;
        double b = 150;
        double c = 900.90;

        boolean aMinimum = a < b && a < c;
        boolean bMinimum = b < a && b < c;
        boolean cMinimum = c < a && c < b;

        if (aMinimum){
            System.out.println(a+  " is minimum number");
        }
        if (bMinimum){
            System.out.println(b+" is minimum number");
        }
        if (cMinimum){
            System.out.println(c + " is minimum number");
        }





    }
}
