package OfficeHours.Practice_05_13_2020;

public class statics {

    int instanceVariable = 100;
    static int staticVariable = 200;

   public static void staticMethod(){

   }

    public void instanceMethod(){
        staticMethod();
        System.out.println(staticVariable);
        System.out.println(instanceVariable);
    }


}
