package OfficeHours.Practice_04_08_2020;

public class While_loops_Practice {
    public static void main(String[] args) {

        /*
        initialization (int i=1;)
        while(condition(i<=15;)){
                                statements;
                        iterator++(--);
                                }
         */

        int i =1;
        while (i<=5){
            System.out.println("Hello world");
            i++;
        }

        System.out.println(" ===================================================");

        int j=0;

        while (j<=100){
            if (j%15==0){
                System.out.print(j+" ");
            }

            j++;
        }

        System.out.println(" ===================================================");





    }
}
