package day07_IfStatements;

public class Vote {
    public static void main(String[] args) {

        int age = 18;
        boolean UScitizen = true;
        boolean LikeDonald = true;

        boolean eligible = age >= 18 && UScitizen == true;

        if (eligible){
            System.out.println("Your are eligible to vote");
        }
        if (!eligible){
            System.out.println("You are not elibible to vote");
        }
        if (eligible != true){
            System.out.println("You are not eligible to vote");
        }



    }
}
