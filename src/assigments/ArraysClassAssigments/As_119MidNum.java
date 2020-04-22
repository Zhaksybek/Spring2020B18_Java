package assigments.ArraysClassAssigments;
import java.util.Scanner;
public class As_119MidNum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = 0;
        double total = 0;
        double avgTemp = 0;
        double[] temps = { scan.nextDouble(), scan.nextDouble(), scan.nextDouble(), scan.nextDouble(),
                scan.nextDouble(), scan.nextDouble(), scan.nextDouble() , scan.nextDouble()  };

        for (double EachLoop: temps){
            k++;
            total += EachLoop;
            }
        avgTemp= total/k;
        System.out.println(avgTemp);




    }
}
