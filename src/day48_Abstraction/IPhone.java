package day48_Abstraction;

public class IPhone extends Phone{

    static {
        brand="IPhone";
    }
    public IPhone(String model, double price, String size){

        this.model=model;
        this.price=price;
        this.size=size;
    }

    public void faceTiming(long phoneNumber){
        System.out.println( "Iphone is facetiming with "+phoneNumber );

    }

    @Override
    public void calling(long phoneNumber){
        System.out.println("Iphone is calling to "+phoneNumber);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Iphone is texting to "+phoneNumber);

    }
}
