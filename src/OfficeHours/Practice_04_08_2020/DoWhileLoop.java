package OfficeHours.Practice_04_08_2020;

public class DoWhileLoop {
    public static void main(String[] args) {

        boolean b=false;

        do {
            System.out.println("Hello World");
        }while (b);


        System.out.println("============================");

        int j=0;

        do {
            if (j%15==0){
                System.out.print(j+" ");
            }


            j++;
        }while (j<=100);


    }
}
