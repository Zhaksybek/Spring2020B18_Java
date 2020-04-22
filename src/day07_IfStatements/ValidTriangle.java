package day07_IfStatements;

/*

 */

public class ValidTriangle {
    public static void main(String[] args) {
        short angel1 = 30;
        short angel2 = 50;
        short angel3 = 100;

        int sumOfAngels = (short)(angel1 + angel2 + angel3);

        boolean validTraingle = sumOfAngels == 180;

        if (sumOfAngels==180) {
            System.out.println("The shape is triangle");
        }
        if (!(sumOfAngels==180)){

        System.out.println("The shape is not a valid triangle");
        }







    }
}
