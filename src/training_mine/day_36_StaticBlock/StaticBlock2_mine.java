package training_mine.day_36_StaticBlock;

import OfficeHours.Practice_05_06_2020.Tester;

public class StaticBlock2_mine {

    static int a;
    static int b;
    int c;

    static Tester tester1 = new Tester();

    public static void main(String[] args) {
        tester1.setInfo("Jack","SDET",120000,123);
        System.out.println(tester1);
    }



    static {
        a=100;
        b=200;
        if (100 > 200){
            a = 100;
        }else {
            b =200;
        }

        tester1.setInfo("Jack","SDET",120000,123);

    }


}
