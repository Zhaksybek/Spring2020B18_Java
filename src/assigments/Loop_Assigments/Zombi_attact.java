package assigments.Loop_Assigments;
import java.util.Scanner;
public class Zombi_attact {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int inhabitants = scan.nextInt();
        System.out.println("inhabitants is "+inhabitants);
        int day=0;

        int i =inhabitants;

        if (inhabitants==0){
            System.out.println("---- EXTINCT ----");
        }

        while (i>=1){
            System.out.println("Day "+day+" ["+inhabitants+"]");
            day++;
            inhabitants /=2;

            if (inhabitants==1){
                System.out.println("Day "+day+" ["+inhabitants+"]");
                System.out.println("---- EXTINCT ----");
                break;}
        }
        /*
        for (int i =inhabitants; i>=1;  i /=2){
            System.out.println("Day "+day+" ["+inhabitants+"]");
            day++;
            if (day>0){
                System.out.println("Day "+day+" ["+inhabitants/2+"]");
                inhabitants /=2;
            }
            if (inhabitants==1){
                System.out.println("---- EXTINCT ----");
                break;
            }
        }*/

    }
}
