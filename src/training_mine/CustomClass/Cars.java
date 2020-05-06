package training_mine.CustomClass;

public class Cars {

    String Brand;
    String model;
    int year;
    String color;

    public void start(){
        System.out.println(Brand + " is started");
    }

    public void drive(){
        System.out.println("Driving "+Brand+" "+model);
    }

    public void getCarInfo(){
        System.out.println( year+" "+ Brand+" "+ model+" "+color);

    }

    public void setCarInfo(String carBrend, String carmodel, int carYear, String carColor ){
        Brand=carBrend;
        model=carmodel;
        year=carYear;
        color=carColor;
    }

    public String toString(){
        String result = Brand+" "+ year+" "+ model+" "+color;
        return result;
    }










}
