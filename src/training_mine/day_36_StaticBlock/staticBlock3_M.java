package training_mine.day_36_StaticBlock;

import day34_CustomClass.Tester;

public class staticBlock3_M {

    static  String name;
    static int num;

    static Tester tester1 = new Tester();



    static {
        name = "Jansaia";
        num = 1555;
        tester1.setTesterInfo("Zhaksybek", 123,"SDET",130_000);
    }



/*
    public static void main(String[] args) {
        name="Jake";
        num=200;

        System.out.println(name);
        System.out.println(num);


    }

 */



}
