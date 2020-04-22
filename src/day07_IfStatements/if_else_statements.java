package day07_IfStatements;

public class if_else_statements {
    public static void main(String[] args) {

        int number = 100;

        if (number % 2 == 0 ){
            System.out.println(number+" is even number");
        }
        else { // otherwise
            System.out.println(number+" is odd number");
        }

        int age = 30;
        boolean ageBigger = age >= 21;

        if(ageBigger){
            System.out.println("Here is your Vodka");
        }
        else {
            System.out.println("Go home kid");
        }


        boolean testedPositiveForCorona = true;
        if (testedPositiveForCorona){
            System.out.println("Buy more toilet papers and home");
        }
        else {
            System.out.println("Do more coding");
        }





    }
}
