package training_mine.METHODS;

public class SystemExit {
    public static void main(String[] args) {

        method();

        System.out.println("Done");
        System.out.println("Completed");

    }//main


    public static void method(){
        System.out.println("Hello world");
        System.exit(0);
    }




    public static int number(){
   if (8>9){
    System.exit(0);   // exists all java execution
   }

        return 5;
    }





}//class
