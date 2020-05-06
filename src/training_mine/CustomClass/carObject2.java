package training_mine.CustomClass;

import java.lang.reflect.Array;
import java.util.Arrays;

public class carObject2 {

    public static void main(String[] args) {


        Cars car1 =new Cars();

        car1.setCarInfo("Infininty", "Fx",2008,"White");

        car1.getCarInfo();


        System.out.println("===============");
        Cars car2 = new Cars();

        car2.setCarInfo("Audi","A6",1997,"Black");
        car2.getCarInfo();

        System.out.println("===============");
        Cars car3 =new Cars();
        car3.setCarInfo("Subaru", "Legacy", 1992,"Red");
        car3.getCarInfo();

        System.out.println("==================================================");

        Cars[] carsArr = {car1,car2, car3};

        for (int i=0; i<carsArr.length; i++){
            carsArr[i].getCarInfo();

        }


        System.out.println("==================================================");

        for (Cars each : carsArr){
            each.getCarInfo();
        }


        System.out.println("========================");

        System.out.println(car1);





    }


}
