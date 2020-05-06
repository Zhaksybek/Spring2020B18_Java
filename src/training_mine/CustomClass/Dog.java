package training_mine.CustomClass;

public class Dog {

    String breeds;
    String color;
    int age;
    String name;

    public void sleep(){
        System.out.println(name+" is sleeping");
    }

    public void eat(String dogFood){
        System.out.println(name+" is eating"+dogFood);
    }

    public void drink(String drink){
        System.out.println(name+" is drinking "+drink);
    }

    public void setDogInfo(String dogBreeds, String dogColor, int dogAge, String dogName){
        breeds=dogBreeds;
        color=dogColor;
        age=dogAge;
        name=dogName;
    }

    public String toString(){
        String result = name+" breeds is: "+breeds+" color is "+color+" year is "+age;
    return result;
    }





}
