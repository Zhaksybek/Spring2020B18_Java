package Resources;

import day42_Inheritance.Accessmodifiers;
import day42_Inheritance.TestData2;

public class Inheritance2  extends Accessmodifiers  {
    //        sub                   super

    /*
    publicVariable
    protectedVariable

    publicMethod
    protectedMethod

     */

    public static void main(String[] args) {
        System.out.println( TestData2.publicVariable);
        System.out.println( TestData2.protectedVariable );
       // System.out.println( TestData2.defaultVariable );   we don't have access to default: different Package

        TestData2.publicMethod();
        TestData2.protectedMethod();
       // TestData2.defaultMethod();       //        we don't have access to default : because: Different package
    }


}
