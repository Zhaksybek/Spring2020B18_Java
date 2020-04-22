package training_mine.METHODS;

public class Method_practice {
    public static void main(String[] args) {
        int z =100;

        oddOrEven(z);

        SumOfToNums(10,66);  // still not enough information


    }




    public static void SumOfToNums(int a, int b) {
        System.out.println("Sum of "+a+" and "+b+" is: "+(a+b));

    }



    public static void oddOrEven(int a){

        if (a %2 ==0){
            System.out.println(a+" is Even number");
        }else {
            System.out.println(a+" is Odd number");
        }


    }



}
