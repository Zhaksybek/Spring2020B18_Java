package day41_Inheritance;

public class Fish extends Animal {

    /*
     public String name;
    public String size;
    public double weight;

    public void eat(){
        System.out.println(name+" is eating");
    }

    public  void move(){
        System.out.println(name+" is moving");
    }
     */

    public void swim(){
        System.out.println(name+" is swimming");
    }

    public static void main(String[] args) {

        Fish obj1 = new Fish();
        obj1.name = "Nemo";
        obj1.weight = 5;

        obj1.eat();
        obj1.move();
        obj1.swim();




    }

}
