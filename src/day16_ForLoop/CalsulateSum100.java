package day16_ForLoop;

public class CalsulateSum100 {
    public static void main(String[] args) {
/*
3. write a program that can calculate the sum of all the even numbers between 1 ~ 100
	4. write a program that can calculate the sum of all the odd numbers between 1 ~ 100;

 */         int sum =0;
            int sum2 =0;
         for (int i = 0; i <= 100 ; i++ ){

             if (i% 2 ==0){ // even numbers
                 sum += i;
             }else {
                 sum2 += i;
             }
         }

        System.out.println("sum of all even numbers: " +sum);
        System.out.println("sum of all even numbers: " +sum2);


    }
}
