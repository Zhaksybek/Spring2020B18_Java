package day48_Abstraction;

public class Xiaomi extends Phone{

    static {
        brand="Xiaomi";
    }
    public Xiaomi(String model, double price, String size){

        this.model=model;
        this.price=price;
        this.size=size;
    }



    @Override
    public void calling(long phoneNumber){
        System.out.println("Xiaomi is calling to "+phoneNumber);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Xiaomi is texting to "+phoneNumber);

    }



}
