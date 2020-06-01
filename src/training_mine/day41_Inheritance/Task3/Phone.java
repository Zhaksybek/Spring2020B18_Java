package training_mine.day41_Inheritance.Task3;

public class Phone extends Device {



    public Phone(String brand, String model, double price, String country, String size){
        setDevice(brand,model,price,country,"Phone",size);
    }

    public void call(long number){
        System.out.println("Calling the number "+number);
    }

    public void text(long number){
        System.out.println("Texting the number "+number);
    }




}
