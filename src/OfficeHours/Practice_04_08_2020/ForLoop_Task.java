package OfficeHours.Practice_04_08_2020;

public class ForLoop_Task {
    public static void main(String[] args) {

        /*
        0~100     find num    "/" ==> 3 or 5
         */
        for (int i=0; i <=100; i++){

        if (i%3==0 || i%5==0){
            System.out.print(i+" ");
              }
        }

        System.out.println("=================================");

        String name ="Zhaksybek";
        String revers ="";

        for (int i=name.length()-1; i>=0; i--){

            revers +=name.charAt(i);

        }
        System.out.println(revers);


        System.out.println("=================================");
        System.out.println("=================================");

        String name2 ="Zhaksybek";
        String revers2 ="";

        int a=name2.length()-1;

        while (a>=0){
           revers2 += name2.charAt(a);
            a--;
        }
        System.out.println(revers2);

        System.out.println();

        System.out.println("=================================");

        String name5 = "Anna";
        //     0123
        String result5 = ""; // annA

        int lastIndex =  name5.length()-1;
        for(int i = lastIndex; i >= 0; i-- ){
            // result = result + name.charAt(i);
            result5 += name5.substring(i, i+1);
                               //    3, 4 ==> a
                               //    2, 3 ==> n
                               //    1, 2 ==> n
                               //    0, 1 ==> A
        }


        System.out.println(result5);



    }
}
