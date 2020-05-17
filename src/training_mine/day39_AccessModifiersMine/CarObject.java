package training_mine.day39_AccessModifiersMine;

public class CarObject {

    public static void main(String[] args) {

        Car car1 = new Car("Audi");

        System.out.println(car1);

        Car car2 = new Car("Porsche","Panamera4s");
        System.out.println(car2);

        Car car3 = new Car("Mercedes","Brabus",2020);
        System.out.println(car3);


        Car car4 = new Car("Audi","TT",2020, 50_000);
        System.out.println(car4);







    }


}
