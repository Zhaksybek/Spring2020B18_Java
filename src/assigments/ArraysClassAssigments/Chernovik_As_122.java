package assigments.ArraysClassAssigments;
import java.util.Arrays;
import java.util.Scanner;
public class Chernovik_As_122 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] inhabitants = new int[8];
        for(int i=0; i<inhabitants.length; i++) {
            inhabitants[i] = input.nextInt();
        }

        //TODO. Write you code below this line.

        int[] inhabAfter = new int[inhabitants.length];
        int[]  inhabFinal = {0, 0, 0, 0, 0, 0, 0, 0};
        int sum=0;
        int day =0;
        int j=0;


       do {

            for (int i = 0; i < inhabitants.length; i++)  {
                sum += inhabitants[i];
            }





            if (sum!=0){
                System.out.println("Day "+day +" "+ Arrays.toString(inhabitants));
                for (int i = 0; i < inhabitants.length; i++)  {
                    inhabitants[i] = inhabitants[i] / 2;

                }


            }

            if (sum==0) {
                System.out.println("Day " + day + " " + Arrays.toString(inhabAfter));
                System.out.println("---- EXTINCT ----");
                break;
                //System.exit(0);
            }

            day++;


           // j+=sum;
        } while (Arrays.equals(inhabitants,inhabFinal));          // while (j<=sum);






    }
}
