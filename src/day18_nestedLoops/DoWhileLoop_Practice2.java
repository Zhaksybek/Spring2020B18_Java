package day18_nestedLoops;

public class DoWhileLoop_Practice2 {
    public static void main(String[] args) {
       /*
       print even num  0~100
        */

       int num= 0;
       //int result =0;

        do {
        if (num%2!=0){
            System.out.print(num+" ");
            //continue;
        }
           //System.out.print(num+" ");

           num++;
       }while (num <= 10);

        System.out.println("==========================================================");





        System.out.println("==========================================================");

        int i =1;

        do {
            System.out.println(i);
            i++;
        }while (i <= 5);

        System.out.println("==========================================================");

        int z=1;
        do {
            System.out.println(z);
            if (z == 2){
                break;
            }
            z++;
        }while (z <= 5);



        System.out.println("==========================================================");
        System.out.println("==========================================================");

        int y =1;
        do {
            if (y==3){
                y++;// need to make sure that the iterator is not skipping!!!!!!
                continue;
            }
            System.out.println(y);

            y++;

        }while (y<=5);


        System.out.println("==========================================================");
        System.out.println("==========================================================");



        int t=1;
        do {

            if (t%2 !=0){
                t++;
                continue;
            }
            System.out.print(t+" ");
            t++;
        }while (t<=100);




    }
}
