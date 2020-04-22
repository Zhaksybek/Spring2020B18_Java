package day11_Scanner_Continue;

public class Browsers {
    public static void main(String[] args) {

        String browserName = "Chrome";

        switch (browserName){

            case "Chrome":
                System.out.println("Chrome ");
                break;
            case "Firefox":
                System.out.println("Firefox is opening");
                break;
            case "Safari":
                System.out.println("Safari is opening");
                break;
            case "Opera":
                System.out.println("Opera is opening");
               break;

            default:
                System.out.println("Invalid Browser Name, Please give the right browser");
               break;


        }



    }
}
