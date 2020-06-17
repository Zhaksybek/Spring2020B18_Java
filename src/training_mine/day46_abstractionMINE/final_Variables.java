package training_mine.day46_abstractionMINE;

public  class final_Variables {

    final int InstanceVariable = 300;
//    final int InstanceVariable2 ;  // final instance variables need to be initialized

    static int staticVariables = 1000;

    static {

    }



    public static void main(String[] args) {

        final double PI = 3.14;

        final String gender = "Male";
        // gender = "Female"

        final int score;
        score = 100;

        System.out.println(score);

        System.out.println("====================");

        final_Variables obj1 = new final_Variables();
        // obj1.InstanceVariable = 400;  // we cannot initialize final
        int a = 400 + obj1.InstanceVariable;


        staticVariables = 2000;







    }

}
