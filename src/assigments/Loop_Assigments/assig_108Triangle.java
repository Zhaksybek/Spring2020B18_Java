package assigments.Loop_Assigments;
import java.util.Scanner;
public class assig_108Triangle {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();


        for(i= 1; i <=n; i++){

            for (j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();

        }


    }
}
