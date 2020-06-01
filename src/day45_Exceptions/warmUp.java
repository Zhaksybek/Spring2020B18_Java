package day45_Exceptions;

import sun.awt.windows.ThemeReader;

public class warmUp {

    public static void main(String[] args) {

    int pushups =1;
     while (pushups <= 20){
         System.out.println("Pushup "+ pushups);
         try {
             Thread.sleep(300);
         }catch (Exception e){

         }

         pushups++;
     }



    }


}
