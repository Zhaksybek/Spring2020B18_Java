package assigments.ArraysClassAssigments;
import java.util.Arrays;
import java.util.Scanner;
public class As_122ZombiAttac {
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


        while (j<=sum) {
                         //for (int h = inhabitants[i])

            for (int i = 0; i < inhabitants.length; i++)  {
                inhabAfter[i] = inhabitants[i] / 2;
                sum += inhabAfter[i];
            }

            for (int i = 0; i < inhabitants.length; i++)  {
                inhabAfter[i] = inhabitants[i] / 2;
               }



            if (sum!=0){
                System.out.println("Day "+day++ +" "+ Arrays.toString(inhabAfter));
                for (int k = 0; k < inhabitants.length; k++){
                    inhabitants[k]=inhabAfter[k];
                }
            }else {
                System.out.println("Day "+day++  +" "+ Arrays.toString(inhabAfter));
                System.out.println("---- EXTINCT ----");
                System.exit(0);
            }

            //main while
            //System.out.println(Arrays.toString(inhabAfter));
            //System.out.println(sum);
            j+=sum;
        }



        /*
                 Day 0 [1, 3, 0, 2, 1, 1, 3, 0]
                 Day 1 [0, 1, 0, 1, 0, 0, 1, 0]
         */



          /*
        for (int i=0; i<inhabitants.length; i++){
            //inhabitants[i]  = inhabitants[i];

        }*/







        /*
      int j = arr.length -1; //500
        for(int i =0; i < arr.length; i++ ){
            RevArr[i] = arr[j];
            j--;
        }



public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int inhabitants = scan.nextInt();

     //System.out.println("inhabitants is "+inhabitants);
        int day=0;

         if (inhabitants==0){
            System.out.println("---- EXTINCT ----");
        }

        int i =inhabitants;
        while (i>=1){
            System.out.println("Day "+day+" ["+inhabitants+"]");
            day++;
            inhabitants /=2;

            if (inhabitants==1){
                System.out.println("Day "+day+" ["+inhabitants+"]");
                System.out.println("---- EXTINCT ----");
                break;}
        }

  }
}
         */







    }
}
