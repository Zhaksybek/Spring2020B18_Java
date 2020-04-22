package training_mine.FOR_LOOP;

public class Practice2 {
    public static void main(String[] args) {

        /*
        sum of 1~1000
         */
        int sum=0;
        for (int i=1;i <= 1000; i++ ){
            sum +=i;
        }
        System.out.println("sum of 1~1000 is: "+ sum);

        System.out.println("====================================================================");

        //task even 1~1000
        int sum2=0;
           for (int i=1; i<=1000; i++){
               if (i%2 ==0){
                   sum2 += i;

               }
           }
        System.out.println("sum of even num 1~1000 is: "+sum2);

           int Sum2 = 0;
           for (int i=2; i <=1000; i +=2){
               Sum2 += i;
           }
        System.out.println("sum of even num 1~1000 is: "+Sum2);


        System.out.println("====================================================================");
           //Taks03:
        int sum3=0;
        for (int i=1; i<1000; i++){
            if (i%2 !=0){
                sum3 +=i;
            }
        }
        System.out.println("sum3 of all odd numbers: "+sum3);

        int Sum3 =0;
        for (int i=1; i<=1000; i +=2){
            Sum3 +=i;
        }
        System.out.println("SUM3 of all odd numbers is: "+Sum3);

        System.out.println("====================================================================");


    }
}
