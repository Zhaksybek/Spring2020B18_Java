package training_mine.day41_Inheritance;

import com.sun.org.apache.xerces.internal.impl.xpath.XPath;

public class Accessmodifiers {

    public static String publicVariable = "public";
    protected static String protectedVariable = "protected";
    static String defaultVariable = "default";
    private static String privateVariable = "private";

    public static void publicMethod(){
        System.out.println("public method");
    }

    static void defaultMethod(){
        System.out.println("default method");
    }

    private  static void privateMethods(){
        System.out.println("private method");
    }



}
