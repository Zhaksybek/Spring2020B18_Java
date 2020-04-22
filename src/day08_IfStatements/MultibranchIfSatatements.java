package day08_IfStatements;

public class MultibranchIfSatatements {
    public static void main(String[] args) {

        int a = 100;
        boolean zero = a ==0;
        boolean negative = a<0;
        boolean positive = a>0;

        if (zero){
            System.out.println("It is zero");
        } else if (negative){
            System.out.println(a+" it is negative");
        }else if (positive){
            System.out.println(a+" it is positive");
        }






    }
}
