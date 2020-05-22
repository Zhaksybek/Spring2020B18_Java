package OfficeHours.Practice_05_20_2020;

public class House {
    public static void main(String[] args) {

        Dog dog1 =new Dog("Sharik",3, "Yellow","Big","German Shepherd");
        //dog1.setInfo("Sharik",3, "Yellow","Big","German Shepherd");

        Dog dog2 =new Dog("Ridnick", 5, "White", "Huge","Kangal");
        System.out.println(dog1);
        dog2.bark();


        System.out.println("=============================================");

        Cat cat1 = new Cat("Muki", 2,"White","small","Angora");
        cat1.setInfo("Muki", 2,"White","small","Angora");

        System.out.println(cat1);
        cat1.scratch();

        Cat cat2 = new Cat("Murka", 2,"White","small","British Shorthair");


        System.out.println("=============================================");

        Bunny bunny1 = new Bunny("Rex",4,"Black", "Middle","Mini Lop");
        //bunny1.setInfo("Rex",4,"Black", "Middle","Mini Lop");


        System.out.println(bunny1);
        bunny1.dig();






    }
}
