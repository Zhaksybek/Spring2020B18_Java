package day38_Constructors;

public class Dog {

    String name;
    String breed;
    int age;

    public Dog(){ // sets the default value for all instances
        name = "unkown";
        breed = "unkown";
        age =0;
    }

    public Dog(String breed){
        this.breed = breed;
        name = "unknown";
        age = 0;
    }

    public Dog(String breed, int age){
        this.breed=breed;
        this.age=age;
        name="Unknow";
    }

    public Dog(String name,String breed, int age){
        this.name=name;
        this.breed=breed;
        this.age=age;

    }

    public String toString(){
        return "Name: "+name+", breed: "+breed+", age: "+age;
    }


  /*  public void method1(){

    }

    public void method1(int a){

    }

   */





}
