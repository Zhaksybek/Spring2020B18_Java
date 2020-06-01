package training_mine.day41_Inheritance.Task3;

public class Device {

    /*
    creata a class called device:
                attributes: brand, model, price, country
                methods: toString

        create a class called TV:
                attributes: brand, model, price, country
                methods: watch, toString

        create ba class called phone:
                attributes: brand, model, price, country
                methods: call, text,  toString
     */

    public String brand;
    public String model;
    public double price;
    public String country;
    public String type;
    public String size;

    public void setDevice(String brand, String model, double price, String country, String type ,String size){
        this.brand=brand;
        this.model=model;
        this.price=price;
        this.country=country;
        this.type=type;
        this.size=size;
    }


    @Override
    public String toString() {
        return "Device{" +
                "brand: " + brand + '\'' +
                ", model: " + model + '\'' +
                ", price: $" + price +
                ", country: " + country + '\'' +
                ", type: " + type + '\'' +
                ", size: " + size + '\'' +
                '}';
    }
}
