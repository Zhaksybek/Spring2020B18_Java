package assigments.ArraysClassAssigments;
import java.util.Arrays;
import java.util.Scanner;
public class As_122_third_Attemp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        //TODO. Write you code below this line.


        int[]  inhabFinal = new int[8];
        int day=0;


        do {
            System.out.println("Day "+ day+" "+ Arrays.toString(inhabitants)  );
            day++;

            for (int i = 0; i < inhabitants.length; i++)  {
                inhabitants[i] = inhabitants[i] / 2;
            }

        }while (!Arrays.equals(inhabitants,inhabFinal));

        System.out.println("Day "+ day+" "+ Arrays.toString(inhabitants)  );
        System.out.println("---- EXTINCT ----");





    }
}
