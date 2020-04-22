package day07_IfStatements;
/*
 write a java program that accepts three numbers and rteurn the mediam number
				(assume that none of them are equal)
 */
public class MediumNumber {
    public static void main(String[] args) {
        double a = 10;
        double b = 5000;
        double c = 2000;
        // birnarse duris emes tekseru kerek

        boolean aMedium = (a < b && a > c) || ( a > b && a < c);
                         // b < a < c  or c < a < c
        boolean bMedium = (b > c && b < a) || ( b > a && b < c);
                            // c < b < a or a < b < c
        boolean cMedium = (c < b && c > a) || (c > b && c < a);
                            // c < b < a or b < c < a

        if (aMedium){
            System.out.println(a+" is medium number");
            }
        if (bMedium){
            System.out.println(b+" is medium number");
        }
        if (cMedium){
            System.out.println(c+" is medium number");
        }

    }
}
