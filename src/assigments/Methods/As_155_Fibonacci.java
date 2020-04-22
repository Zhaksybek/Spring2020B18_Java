package assigments.Methods;
import java.util.*;
public class As_155_Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        fib(num);





    }

    public static void fib(int num){
        //WRITE YOUR CODE HERE

        int t1 = 0, t2 = 1, sum=0;
        for (int i = 1; i <= num+1; ++i) {

            sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
        System.out.println(sum-t1);
    }


}



    /*
    replit 155:  0 1  1 2 3 5 8
 0 ==> 0
 1 ==> 1
 2 ==> 1
 3 ==> 2
 4 ==> 3
 5 ==> 5
 6 ==> 8
 7 ==> 13
 8 ==> 21
 9 ==> 34
     */


