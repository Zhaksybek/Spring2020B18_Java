package day48_Abstraction;

public class PhoneObjects {
    public static void main(String[] args) {

        IPhone iPhone1 = new IPhone("XsMax",1300,"12 inches");
        IPhone iPhone2 = new IPhone("8",500,"10 inches");

        System.out.println( iPhone1 );
        System.out.println( iPhone2 );

        iPhone1.calling(321654987);
        iPhone1.texting(911);
        iPhone1.faceTiming(987654321);

        iPhone2.calling(87473822);
        iPhone2.texting(65454);

        System.out.println("=======================================");

        Xiaomi xiaomi1 = new Xiaomi("Redmi X1",400,"8 inches");
        Xiaomi xiaomi2 = new Xiaomi("Redmi X2",500,"10 inches");

        xiaomi1.calling(321654);
        xiaomi1.texting(45613456);
        System.out.println(xiaomi1);
        System.out.println(xiaomi2);





    }
}
