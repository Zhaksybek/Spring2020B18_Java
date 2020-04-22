package training_mine.Arrays_training;

import java.util.Arrays;

public class Dessending {
    public static void main(String[] args) {

        int[] arrAsc = {99,88,-5,444,66,0,74,3};
        Arrays.sort(arrAsc);

        int[] arrDes= new int[arrAsc.length];

        int j =0;
        for (int i= arrAsc.length-1; i>=0; i--){
            arrDes[j]=arrAsc[i];
            j++;
        }
        System.out.println("Ascending "+Arrays.toString(arrAsc));
        System.out.println("Descending "+Arrays.toString(arrDes));


    }
}
