package training_mine.day41_Inheritance.Task3;

public class TV extends Device{

    /*
    public String brand;
    public String model;
    public double price;
    public String country;
    public String type;
    size

    watch
    toString  (Inherited)
     */


    public TV(String brand, String model, double price, String country, String size){
        setDevice(brand,model,price,country,"TV",size);
    }


    public void watch(){
        System.out.println("watching "+brand+" TV");
    }









}
