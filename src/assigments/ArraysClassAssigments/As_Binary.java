package assigments.ArraysClassAssigments;
import java.util.Scanner;

public class As_Binary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] binary = new int[8];
        for(int i =0; i < binary.length; i++) {
            binary[i] = input.nextInt();
        }

        //TODO: Write your code below.
        int result=0;
        int p =0;

        for (int j=binary.length-1; j >=0; j--){

            result += binary[j] * 2*Math.pow(2,p);
            p++;

        }
        System.out.println(result/2);





    }
}
