package training_mine.Flipgrid;

public class Car {   // super
    String brand;
    String carName;
    int    year;

    public void method1(){
        System.out.println("method1 from  SUPER class");

    }

}


class Toyota extends Car {  // sub class of Car

    String made = "Made in JAPAN"; // only for Toyota

    public Toyota(String brand, String carName, int year){
        this.brand   = brand;
        this.carName = carName;
        this.year    = year;
    }

    @Override
    public void method1(){  // Override method1, gave dif implementation
        System.out.println(  "OVERRIDEN METHOD: Toyota is good car "  );
    }


}

class Audi extends Car{  // Audi sub class of Car

    String made = "Made in GERMANY";

    public Audi(String brand, String carName, int year){
        this.brand   = brand;
        this.carName = carName;
        this.year    = year;
    }


    // I did not override method

}

class carDealer{
    public static void main(String[] args) {

        Toyota toyota1 = new Toyota("Toyota","Camry",2020);


        System.out.println("Variable made from toyota class: "+  toyota1.made  );  // we can use it directly, coz object from was created from Toyota
        toyota1.method1(); // we override it and gave dif implementation

        Car car1 =  toyota1;  // upper casting: done automatically ( implicitly )


        System.out.println("==========================");

        Car car2 = new Audi("Audi", "A8",2019);

        //System.out.println(  car2.made  );  // gives error, coz object eas created by Super class name

       // car2.method1(); // we can use it coz we inherited it but we didn't give dif implementation

        Audi audi1 = (Audi) car2; // down casting(explicitly): manually;

        System.out.println("Variable made from audi class: "+  audi1.made  ); // after casting we can use all  variables and methods from Audi class

        audi1.method1();

        System.out.println("we inherited method1 but didn't override it; Then automatically executed from Super class ");



















    }
}
