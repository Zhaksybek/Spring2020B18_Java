package assigments.Methods;

public class As_162 {
    public static void main(String[] args) {

        System.out.println(threeLocks(true,false,true));

 //  ab ac   ba bc   ca ca abc
    }

    public static boolean threeLocks(boolean a, boolean b, boolean c) {
        boolean result = (a==true&&b==true)?true:(a==true&&c==true)?true:(b==true&&a==true)?true
                :(b==true&&c==true)?true:(c==true&&a==true)?true:(c==true&&b==true)?true
                :(a==true&&b==true&&c==true)?true:false;

     return result;

    }//end threeLocks
}
