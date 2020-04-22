package day07_IfStatements;
/*
write a java program that accepts three numbers and return the maximum number
				(assume that none of them are equal)
 */
public class MaxNumber {
    public static void main(String[] args) {

        double a = 100.5;
        double b = 200.5;
        double c = 300.5;

        boolean aGreater = a > b && a > c; // if a is greater than both b and c, then a is maximum
        boolean bGreater = b > a && b > c; // if b is gret. than b and c
        boolean cGreater = c > b && c > a; // c is gret. a and c
        if(aGreater){
            System.out.println("a is greater than both b and c, then a is maximum");
            }
        if (bGreater){
            System.out.println("b is greater than both a and c, then b is maximum");
        }
        if (cGreater){
            System.out.println("c is greater than both a and b, then c is maximum");
        }

    }
}
