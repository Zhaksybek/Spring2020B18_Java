package training_mine.day50_Ploymorphism;

/*

 */

public final class Cat extends Animal {

    public String catName;

    public Cat(String catName, String gender, int age){
        this.catName=catName;
        this.gender=gender;
        this.age=age;
    }

    @Override
    public void eat(){
        System.out.println("Cat "+catName+" is eating");
    }

    @Override
    public void sleep(){
        System.out.println("Cat "+catName+" is sleeping");

    }

    public void scratch(){

    }






}
