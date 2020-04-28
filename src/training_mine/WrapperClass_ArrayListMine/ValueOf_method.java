package training_mine.WrapperClass_ArrayListMine;

public class ValueOf_method {
    public static void main(String[] args) {

           // Value method: converts String value to Wrapper class value

        int z = Integer.valueOf("1234");  // unboxing
        Integer z1 = Integer.valueOf("1234"); // none

        Integer z2 = (int)Integer.valueOf("1234");  // auto-boxing

        System.out.println(z2);


            boolean Bool1 =  Boolean.valueOf("TRUE"); // unboxing
        System.out.println(Bool1);   // Value methods ignore the case sensitivity


        int totalNum = 100;
        String str3 = "" + totalNum; // none

        Integer num = Integer.valueOf(str3);

        System.out.println(num+1);








    }
}
