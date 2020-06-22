package training_mine.day50_Ploymorphism;

import static training_mine.day50_Ploymorphism.Dog.methodA;

public class AnimalObjects {

    public static void main(String[] args) {

        Dog obj1 = new Dog("Arlan",6,"Male");
        System.out.println(    obj1.dogName   );
        obj1.bark();

        methodA();

        System.out.println("=========  OBJECT 2  =================");

        Animal obj2 = new Dog("Akzholtay",6,"Male");
        //  System.out.println(  obj2.dogName );  // we cannot call it coz reference type doesn't have
        //  System.out.println(  obj2.bark() );
        obj2.eat();
        obj2.sleep();

        obj2.methodA();


        System.out.println("=========    ======  =================");

        Animal animal1 = new Cat("Murka","F",2);

        boolean isDog  = animal1 instanceof Dog;

        System.out.println("boolean isDog == "+isDog);

        Animal d1 = new Dog("Kokjal",1,"Erkek");

        boolean r1 = d1 instanceof Cat;










    }

}
