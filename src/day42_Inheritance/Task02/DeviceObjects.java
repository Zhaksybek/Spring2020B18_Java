package day42_Inheritance.Task02;

public class DeviceObjects {
    public static void main(String[] args) {

        TV tv1 = new TV("Sumsung", "E250",400, "40 inches");
        tv1.country = "the USA";
        System.out.println( tv1 );

        Phone phone1 = new Phone("Iphone", "11S Max",1200,"large");
        System.out.println(phone1);




    }


}
