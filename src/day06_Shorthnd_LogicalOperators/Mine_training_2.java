package day06_Shorthnd_LogicalOperators;

public class Mine_training_2 {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
        boolean flag = true;

        System.out.println("a && b = " + (a&&b));
        System.out.println("a || b = "+(a||b));
        System.out.println("!(a && b) = "+ !(a && b));
        System.out.println("!flag = " + flag);


        int Jaksybek =26,   Jandos = 28;

        if (Jaksybek > Jandos){
            System.out.println("Jaksybek is older than Jandos ");
        } else {
            System.out.println("Janodos is older than Jaksybek");

        }



        System.out.println("------------------------------------------------------");

        int number1 = 1, number2 = 2, number3 = 9;
        boolean result;

        result = (number1 > number2) || (number3 > number1);
        if(result==true){
            System.out.println("Number 1 greater thjan number 2 or Number 3 greater than Number 1 " +result);
        }



        result = (number1 > number2) && (number3 > number1);
        System.out.println(result);




    }
}
