package training_mine.Old_training;

public class diskriminant {
    public static void main(String[] args) {

        byte a =1;
        byte b = 5;
        byte c = 1;

        double result = b*b- 4*a*c;
        double result2 = (-b+Math.pow(result,0.5)/2*a);
        System.out.println("Diskriminant: = " +result);



    }
}
