package training_mine.CustomClass;


import day33_CustomClass.Car;

public class carObject {

    public static void main(String[] args) {

        Cars cars1 = new Cars();
        cars1.Brand = "BMW";
        cars1.model = "X6";
        cars1.color = "Black";
        cars1.year = 2020;


        System.out.println(cars1.Brand);

        System.out.println(cars1.color);

        System.out.println(cars1.model);

        System.out.println(cars1.year);

        cars1.start();
        cars1.drive();

        cars1.getCarInfo();



        System.out.println("======================================");

        Cars cars2 = new Cars();
        cars2.Brand = "Toyota";
        cars2.model = "Camry";
        cars2.year = 2015;
        cars2.color = "Gray";

        System.out.println(cars2.Brand);

        System.out.println(cars2.color);

        System.out.println(cars2.model);

        System.out.println(cars2.year);

        cars2.start();
        cars2.drive();

        cars2.getCarInfo();


        System.out.println("======================================");

        Cars cars3 = new Cars();

        cars3.Brand ="Mercedes";
        cars3.model = "E 230";
        cars3.color = "Blue";
        cars3.year = 1996;

        cars3.getCarInfo();
        cars3.drive();
        cars3.start();


        String str = "A";
        String str2 = "B";

        System.out.println("==============================================");

        String[] arr = { str, str2 };

        Cars[] cars = { cars1, cars2, cars3 };

        cars[0].getCarInfo();
        cars[1].getCarInfo();
        cars[2].getCarInfo();













    }
}
