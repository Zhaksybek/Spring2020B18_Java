package OfficeHours.Practice_05_13_2020;

public class Constructor_Overload {

  public Constructor_Overload(int a){
      System.out.println("default constructor");

  }

    public Constructor_Overload(int a, double d){
        System.out.println("default constructor");

    }

    public static void main(String[] args) {
        Constructor_Overload obj = new Constructor_Overload(123);
    }






}
