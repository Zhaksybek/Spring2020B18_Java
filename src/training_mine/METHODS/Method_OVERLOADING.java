package training_mine.METHODS;

import java.util.Arrays;

public class Method_OVERLOADING {
    // overloading:  same method name, different parametres


    public static void main(String[] args) {
      int result = sum(10,20);
      int result2 = sum(30,40,50);

        


    } //main

    public static int sum (int a, int b){
        return a+b;
    }

    public static int sum (int a, int b, int c){
        return a+b+c;
    }

    public static int sum (int a, long b){
        return (int) (a+b);
    }
    public static double sum (double a, double b){
        return a+b;
    }





}//class
