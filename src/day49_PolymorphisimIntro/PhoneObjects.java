package day49_PolymorphisimIntro;

public class PhoneObjects {

    public static void main(String[] args) {
        IPhone phone1 = new IPhone("XR",750,"8 inches");
        System.out.println(phone1);
        phone1.calling(874738241);
        phone1.download();
        phone1.faceTiming(987654);
        phone1.texting(321654);



    }

}
