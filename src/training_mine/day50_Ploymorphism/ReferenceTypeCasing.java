package training_mine.day50_Ploymorphism;

public class ReferenceTypeCasing {
    public static void main(String[] args) {

        int a = 10;
        double b = a; // implicit casting

        Dog dog = new Dog("a",2,"F");
        Dog dog2 = new Dog("a",2,"F");
        Dog dog3 = new Dog("a",2,"F");

        Animal animal1= dog;  // upcasting done automatically

        dog2 = (Dog) animal1; //  Downcasting

        Cat cat = new Cat("s","M",3);
        // Dog dog3 = cat;
        
        dog3 = (Dog) animal1;







    }

}
