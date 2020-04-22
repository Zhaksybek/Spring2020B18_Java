package training_mine.FOR_LOOP;

public class Practice10 {
    public static void main(String[] args) {

        int sum =0;
        int sum2 = 0;

        for (int i=1; i<=100; i++){
            if (i%2==0) {  //even mumbers
                sum += i;
            }else {
                sum2 += i;
            }
        }
        System.out.println("sum of even num 1~100 "+ sum);
        System.out.println("sum of odd num 1~100 "+sum2);

    }
}
