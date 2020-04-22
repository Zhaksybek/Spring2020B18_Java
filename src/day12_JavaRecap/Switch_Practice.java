package day12_JavaRecap;

public class Switch_Practice {
    public static void main(String[] args) {

        switch (3){
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            case 3:
                System.out.println("Case 3");
                break;
            case 4:
                System.out.println("Case 4");

            default:
                System.out.println("Invalid number");
                break;
        }


        System.out.println("===============================");

        int statusCode = 201;

        switch (statusCode){

            case 200:
                System.out.println("OK");
                break;
            case 201:
                System.out.println("Created");
                break;

            case 202:
                System.out.println("Accepted");
                break;

            default:
                System.out.println("Invalid Status Code");
                break;
        }



    }
}
