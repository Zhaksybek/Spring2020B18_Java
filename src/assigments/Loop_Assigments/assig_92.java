package assigments.Loop_Assigments;
import java.util.Scanner;

public class assig_92 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long result =1;

        int i=n;
        while (i>=1){
            result *=i;
            i--;
        }
        System.out.println(result);


       //16!==20922789888000



    }
}
