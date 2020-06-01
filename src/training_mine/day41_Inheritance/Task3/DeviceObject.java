package training_mine.day41_Inheritance.Task3;

public class DeviceObject {
    public static void main(String[] args) {

        TV tv1 = new TV("LG","Oled one", 450, "China","15 inches");

        TV tv2 = new TV("Sumsung","Sum1", 400, "Korea","12 inches");

        TV tv3 = new TV("LG","Oled one", 450, "China","15 inches");

        System.out.println(tv1);
        System.out.println(tv2);
        System.out.println(tv3);

        System.out.println("======================");

        Phone phone1 = new Phone("Iphone","XR",1300,"the USA","Regular");
        Phone phone2 = new Phone("Sumsung","S10",1100,"Korea","Medium");
        Phone phone3 = new Phone("Xiaomi","Readme X1",400,"China","Medium");
        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);










    }
}
